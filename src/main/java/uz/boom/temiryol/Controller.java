package uz.boom.temiryol;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import uz.boom.temiryol.entity.Problem;

import static java.lang.Math.*;

@org.springframework.stereotype.Controller
public class Controller {

    @PostMapping("/solve")
    public String calculate(Model model, @ModelAttribute("problem") Problem problem) {
        try {
            double exp_fa = exp(problem.getCoefficient() * problem.getUgol());
            double t_r_t = problem.getDiameter() *
                    problem.getC() *
                    problem.getSila() / 2 *
                    (exp_fa - 1) /
                    (problem.getB() + problem.getA() * exp_fa);

            double i_g = problem.getGruz() / problem.getLoparey();
            double n_pl = (1 - pow(problem.getPoteri(), i_g)) /
                    (i_g * (1 - problem.getPoteri())) *
                    pow(problem.getPoteri(), problem.getBlokov());
            double f_q = problem.getWeight() * 9.81;
            double f_sh_k = f_q / i_g * n_pl;
            double t_b = f_sh_k * problem.getDiametrBarabana() / 2;
            boolean result = t_r_t / t_b >= 1.5;

            model.addAttribute("result", result);
        } catch (RuntimeException exception) {
            return "index";
        }

        return "result";
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

}

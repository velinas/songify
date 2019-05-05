package org.playlist.songify.web.controllers;

import org.playlist.songify.domain.models.binding.SongAddBindingModel;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/songs")
public class SongController extends BaseController {

    @GetMapping("/add")
    public ModelAndView add(ModelAndView modelAndView, @ModelAttribute(name = "bindingModel") SongAddBindingModel bindingModel){
        modelAndView.addObject("bindingModel", bindingModel);
        return super.view("addSong");
    }

    @PostMapping("/add")
    public ModelAndView addConfirm(@Valid @ModelAttribute(name = "bindingModel") SongAddBindingModel bindingModel, BindingResult bindingResult, ModelAndView modelAndView){
        if (bindingResult.hasErrors()){
            modelAndView.addObject("bindingModel", bindingModel);
            return super.view("addSong", modelAndView);
        }
        return super.redirect("/");
    }
}

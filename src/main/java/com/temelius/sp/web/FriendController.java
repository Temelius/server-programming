package com.temelius.sp.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.temelius.sp.domain.Friend;

@Controller
public class FriendController {

    private List<Friend> friendList = new ArrayList<Friend>();
    
    // Main page
    @GetMapping("/home")
    public String friendForm(Model model) {
        model.addAttribute("friend", new Friend());
        model.addAttribute("friendList", friendList);
        return "friendslist";
    }
    
    // Add friend action
    @GetMapping("/index")
    public String friendList(@ModelAttribute Friend friend, Model model) {
        friendList.add(friend);
        model.addAttribute("friend", new Friend());
        model.addAttribute("friendList", friendList);
        return "friendslist";
    }
    
    
}

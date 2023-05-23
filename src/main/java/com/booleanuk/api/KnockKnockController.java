package com.booleanuk.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Random;

@RestController
public class KnockKnockController {

    private ArrayList<String> knockJokes;
    private String[] lines;
    Random rand;

    public KnockKnockController() {
        this.knockJokes = new ArrayList<>();
        this.knockJokes.add("Knock, knock.\n" + "Who’s there?\n" + "Beets.\n" + "Beets who?\n" + "Beets me!");
        this.knockJokes.add("Knock, knock.\n" + "Who’s there?\n" + "Weekend.\n" + "Weekend who?\n" + "Weekend do anything we want!");
        this.knockJokes.add("Knock, knock.\n" + "Who’s there?\n" + "Goat.\n" + "Goat who?\n" + "Goat to the door and find out!");
        rand = new Random();
//        int number = this.rand.nextInt(this.knockJokes.size());
//        lines = knockJokes.get(number).split("\r?\n");
    }

    public void getRandom() {
        int number = this.rand.nextInt(this.knockJokes.size());

        lines = knockJokes.get(number).split("\r?\n");

    }


    @GetMapping("/line1")
    public String getFirst() {
        getRandom();
        return lines[0];
    }

    @GetMapping("line1/line2")
    public String getSecond() {
        return lines[0] + lines[1];
    }

    @GetMapping("line1/line2/line3")
    public String getThird() {
        return lines[0] + lines[1] + lines[2];
    }

    @GetMapping("line1/line2/line3/line4")
    public String getFourth() {
        return lines[0] + lines[1] + lines[2] + lines[3];
    }

    @GetMapping("line1/line2/line3/line4/line5")
    public String getFifth() {
        return lines[0] + lines[1] + lines[2] + lines[3] + lines[4];
    }


}

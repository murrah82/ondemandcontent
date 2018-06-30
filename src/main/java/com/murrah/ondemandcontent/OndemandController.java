package com.murrah.ondemandcontent;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class OndemandController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public ContentVO greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new ContentVO(counter.incrementAndGet(),
                String.format(template, name));
    }
}
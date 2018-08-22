package com.murrah.ondemandcontent;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.concurrent.atomic.AtomicLong;

import org.apache.commons.io.IOUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class OndemandController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public HelloVO greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new HelloVO(counter.incrementAndGet(),
                String.format(template, name));
    }


    @RequestMapping(value="/ondemand/{imageName}", method = RequestMethod.GET,produces = MediaType.IMAGE_JPEG_VALUE)
    public @ResponseBody
    byte[] ondemand(@PathVariable("imageName") String imageName) throws IOException {
        System.out.println("Image Name:"+ imageName);
        InputStream in = new FileInputStream("/Users/Muralidharan-MAC/IdeaProjects/ondemandcontent/src/main/resources/"+imageName);
        return IOUtils.toByteArray(in);
    }
}
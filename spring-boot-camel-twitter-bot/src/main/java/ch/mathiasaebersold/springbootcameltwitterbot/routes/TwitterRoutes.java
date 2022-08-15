package ch.mathiasaebersold.springbootcameltwitterbot.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class TwitterRoutes extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer:tick")
                .log("Polling Twitter")
                .to("twitter-directmessage:BotMathias")
                .log("Body ${body}");
    }
}
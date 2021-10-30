package com.github.cleanmvc.core.usecase;

import com.github.cleanmvc.core.port.GreetingGatewayOutputPort;
import com.github.cleanmvc.core.port.GreetingInputPort;
import com.github.cleanmvc.core.port.GreetingPresenterOutputPort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class GreetSomeoneUseCase implements GreetingInputPort {

    private final GreetingPresenterOutputPort greetingPresenter;
    private final GreetingGatewayOutputPort greetingGateway;

    @Override
    public void sayHello(String toWhom) {

        // This is completely abstracted (or "clean") logic:
        // get a greeting, present the greeting.

        greetingPresenter.presentGreeting(greetingGateway.retrievePersonalGreeting(toWhom));
    }
}

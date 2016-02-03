package co.touchlab.researchstack.skin.step;
import co.touchlab.researchstack.backbone.step.Step;
import co.touchlab.researchstack.glue.R;
import co.touchlab.researchstack.skin.ui.scene.SignUpPinCodeConfirmationStepLayout;

public class PassCodeConfirmationStep extends Step
{
    private String pin;

    public PassCodeConfirmationStep(String identifier)
    {
        super(identifier);
    }

    @Override
    public int getSceneTitle()
    {
        return R.string.passcode;
    }

    @Override
    public Class getSceneClass()
    {
        return SignUpPinCodeConfirmationStepLayout.class;
    }

    public void setPin(String pin)
    {
        this.pin = pin;
    }

    public String getPin()
    {
        return pin;
    }
}

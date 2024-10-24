package OMS_RYHMATYO_2024;

public abstract class Visibility {

    Visibility()
    {
        this.inBackground = false;
    }

    private boolean inBackground;

    public void changeVisibility()
    {
        this.inBackground = !this.inBackground;
    }

    public boolean isVisible()
    {
        return this.inBackground;
    }
}

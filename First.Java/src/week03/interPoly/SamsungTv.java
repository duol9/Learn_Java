package week03.interPoly;

// 상위 클래스인 Tv를 상속받고, 멀티리모콘 인터페이스 구현
public class SamsungTv extends Tv implements MultiRemoteController{

    public SamsungTv(String company) {
        super(company);
    }

    @Override
    public void turnOnOff() {
        setPower(!isPower());
        displayPower(getCompany(), isPower());
    }

    @Override
    public void channelUp() {
        setChannel(getChannel() + 1);
        displayChannel(getChannel());
    }

    @Override
    public void channelDown() {
        setChannel(getChannel() - 1);
        displayChannel(getChannel());
    }

    @Override
    public void volumeUp() {
        setVolume(getVolume() + 1);
        displayVolume(getVolume());
    }

    @Override
    public void volumeDown() {
        setVolume(getVolume() - 1);
        displayVolume(getVolume());
    }
}

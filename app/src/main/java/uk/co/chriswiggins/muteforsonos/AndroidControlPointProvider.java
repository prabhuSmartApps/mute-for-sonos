package uk.co.chriswiggins.muteforsonos;

import org.fourthline.cling.android.AndroidUpnpService;
import org.fourthline.cling.controlpoint.ControlPoint;


public class AndroidControlPointProvider implements ControlPointProvider {

  private AndroidUpnpService upnpService;

  public AndroidControlPointProvider(AndroidUpnpService upnpService) {
    this.upnpService = upnpService;
  }


  @Override
  public ControlPoint getControlPoint() {
    return upnpService.getControlPoint();
  }

}
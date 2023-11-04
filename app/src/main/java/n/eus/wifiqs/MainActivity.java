package n.eus.wifiqs;

import android.app.Activity;
import android.net.wifi.WifiManager;
import android.os.Bundle;

public class MainActivity extends Activity {
   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      final WifiManager wifiMan = getSystemService(WifiManager.class);
      wifiMan.setWifiEnabled(!wifiMan.isWifiEnabled());
      finish();
   }
}

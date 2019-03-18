
package com.epublib;

import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.folioreader.FolioReader;

import java.util.HashMap;
import java.util.Map;

public class RNEPubLibModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;
  private static final String DURATION_SHORT_KEY = "SHORT";
  private static final String DURATION_LONG_KEY = "LONG";

  public RNEPubLibModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  public Map<String, Object> getConstants() {
    final Map<String, Object> constants = new HashMap<>();
    constants.put(DURATION_SHORT_KEY, Toast.LENGTH_SHORT);
    constants.put(DURATION_LONG_KEY, Toast.LENGTH_LONG);
    return constants;
  }

  @Override
  public String getName() {
    return "RNEPubLib";
  }

  @ReactMethod
  public void show(String message, int duration) {
    Toast.makeText(getReactApplicationContext(), message, duration).show();
  }

  @ReactMethod
  public void openEPub(int rawId){
    FolioReader fr = FolioReader.get();
    fr.openBook(rawId);
  }

  @ReactMethod
  public void openEPub(String assetOrSdcard){
    FolioReader fr = FolioReader.get();
    fr.openBook(assetOrSdcard);
  }
}
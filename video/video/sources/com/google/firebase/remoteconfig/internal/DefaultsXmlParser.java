package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.Log;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public class DefaultsXmlParser {
    public static final String a = "entry";
    public static final String b = "key";
    public static final String c = "value";

    /* JADX WARN: Removed duplicated region for block: B:43:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0089 A[Catch: IOException -> 0x0013, XmlPullParserException -> 0x0016, TryCatch #2 {IOException -> 0x0013, XmlPullParserException -> 0x0016, blocks: (B:3:0x0007, B:5:0x000d, B:11:0x0019, B:16:0x002b, B:47:0x008d, B:19:0x0034, B:23:0x0044, B:24:0x0048, B:30:0x0056, B:44:0x007e, B:45:0x0084, B:46:0x0089, B:35:0x0065, B:38:0x006f), top: B:52:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Map<String, String> a(Context context, int i) {
        char c2;
        HashMap hashMap = new HashMap();
        try {
            Resources resources = context.getResources();
            if (resources == null) {
                Log.e(FirebaseRemoteConfig.z, "Could not find the resources of the current context while trying to set defaults from an XML.");
                return hashMap;
            }
            XmlResourceParser xml = resources.getXml(i);
            String str = null;
            String str2 = null;
            String str3 = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    str = xml.getName();
                } else if (eventType == 3) {
                    if (xml.getName().equals(a)) {
                        if (str2 != null && str3 != null) {
                            hashMap.put(str2, str3);
                        } else {
                            Log.w(FirebaseRemoteConfig.z, "An entry in the defaults XML has an invalid key and/or value tag.");
                        }
                        str2 = null;
                        str3 = null;
                    }
                    str = null;
                } else if (eventType == 4 && str != null) {
                    int hashCode = str.hashCode();
                    if (hashCode != 106079) {
                        if (hashCode == 111972721 && str.equals("value")) {
                            c2 = 1;
                            if (c2 == 0) {
                                if (c2 != 1) {
                                    Log.w(FirebaseRemoteConfig.z, "Encountered an unexpected tag while parsing the defaults XML.");
                                } else {
                                    str3 = xml.getText();
                                }
                            } else {
                                str2 = xml.getText();
                            }
                        }
                        c2 = 65535;
                        if (c2 == 0) {
                        }
                    } else {
                        if (str.equals("key")) {
                            c2 = 0;
                            if (c2 == 0) {
                            }
                        }
                        c2 = 65535;
                        if (c2 == 0) {
                        }
                    }
                }
            }
            return hashMap;
        } catch (IOException e) {
            e = e;
            Log.e(FirebaseRemoteConfig.z, "Encountered an error while parsing the defaults XML file.", e);
            return hashMap;
        } catch (XmlPullParserException e2) {
            e = e2;
            Log.e(FirebaseRemoteConfig.z, "Encountered an error while parsing the defaults XML file.", e);
            return hashMap;
        }
    }
}

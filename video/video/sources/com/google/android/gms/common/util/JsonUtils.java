package com.google.android.gms.common.util;

import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.AbstractC4253Sp2;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@KeepForSdk
/* loaded from: classes2.dex */
public final class JsonUtils {
    public static final Pattern a = Pattern.compile("\\\\.");
    public static final Pattern b = Pattern.compile("[\\\\\"/\b\f\n\r\t]");

    private JsonUtils() {
    }

    @KeepForSdk
    public static boolean a(@InterfaceC11300zs1 Object obj, @InterfaceC11300zs1 Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
            JSONObject jSONObject = (JSONObject) obj;
            JSONObject jSONObject2 = (JSONObject) obj2;
            if (jSONObject.length() != jSONObject2.length()) {
                return false;
            }
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!jSONObject2.has(next)) {
                    return false;
                }
                try {
                    Preconditions.r(next);
                } catch (JSONException unused) {
                }
                if (!a(jSONObject.get(next), jSONObject2.get(next))) {
                    return false;
                }
            }
            return true;
        } else if ((obj instanceof JSONArray) && (obj2 instanceof JSONArray)) {
            JSONArray jSONArray = (JSONArray) obj;
            JSONArray jSONArray2 = (JSONArray) obj2;
            if (jSONArray.length() != jSONArray2.length()) {
                return false;
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                if (!a(jSONArray.get(i), jSONArray2.get(i))) {
                    return false;
                }
            }
            return true;
        } else {
            return obj.equals(obj2);
        }
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public static String b(@InterfaceC11300zs1 String str) {
        if (!TextUtils.isEmpty(str)) {
            Matcher matcher = b.matcher(str);
            StringBuffer stringBuffer = null;
            while (matcher.find()) {
                if (stringBuffer == null) {
                    stringBuffer = new StringBuffer();
                }
                char charAt = matcher.group().charAt(0);
                if (charAt != '\f') {
                    if (charAt != '\r') {
                        if (charAt != '\"') {
                            if (charAt != '/') {
                                if (charAt != '\\') {
                                    switch (charAt) {
                                        case '\b':
                                            matcher.appendReplacement(stringBuffer, "\\\\b");
                                            continue;
                                        case '\t':
                                            matcher.appendReplacement(stringBuffer, "\\\\t");
                                            continue;
                                        case '\n':
                                            matcher.appendReplacement(stringBuffer, "\\\\n");
                                            continue;
                                    }
                                } else {
                                    matcher.appendReplacement(stringBuffer, "\\\\\\\\");
                                }
                            } else {
                                matcher.appendReplacement(stringBuffer, "\\\\/");
                            }
                        } else {
                            matcher.appendReplacement(stringBuffer, "\\\\\\\"");
                        }
                    } else {
                        matcher.appendReplacement(stringBuffer, "\\\\r");
                    }
                } else {
                    matcher.appendReplacement(stringBuffer, "\\\\f");
                }
            }
            if (stringBuffer != null) {
                matcher.appendTail(stringBuffer);
                return stringBuffer.toString();
            }
            return str;
        }
        return str;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static String c(@InterfaceC5670cr1 String str) {
        if (!TextUtils.isEmpty(str)) {
            String a2 = zzc.a(str);
            Matcher matcher = a.matcher(a2);
            StringBuffer stringBuffer = null;
            while (matcher.find()) {
                if (stringBuffer == null) {
                    stringBuffer = new StringBuffer();
                }
                char charAt = matcher.group().charAt(1);
                if (charAt != '\"') {
                    if (charAt != '/') {
                        if (charAt != '\\') {
                            if (charAt != 'b') {
                                if (charAt != 'f') {
                                    if (charAt != 'n') {
                                        if (charAt != 'r') {
                                            if (charAt == 't') {
                                                matcher.appendReplacement(stringBuffer, "\t");
                                            } else {
                                                throw new IllegalStateException("Found an escaped character that should never be.");
                                            }
                                        } else {
                                            matcher.appendReplacement(stringBuffer, "\r");
                                        }
                                    } else {
                                        matcher.appendReplacement(stringBuffer, "\n");
                                    }
                                } else {
                                    matcher.appendReplacement(stringBuffer, "\f");
                                }
                            } else {
                                matcher.appendReplacement(stringBuffer, "\b");
                            }
                        } else {
                            matcher.appendReplacement(stringBuffer, "\\\\");
                        }
                    } else {
                        matcher.appendReplacement(stringBuffer, RemoteSettings.i);
                    }
                } else {
                    matcher.appendReplacement(stringBuffer, AbstractC4253Sp2.b.x1);
                }
            }
            if (stringBuffer == null) {
                return a2;
            }
            matcher.appendTail(stringBuffer);
            return stringBuffer.toString();
        }
        return str;
    }
}

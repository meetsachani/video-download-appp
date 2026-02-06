package com.google.android.gms.ads.internal.util;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import com.google.android.gms.internal.ads.zzfbz;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbs {
    @InterfaceC11300zs1
    public static Bundle a(JSONObject jSONObject) {
        Bundle bundle;
        String str;
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> keys = jSONObject.keys();
        Bundle bundle2 = new Bundle();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt != null) {
                if (opt instanceof Boolean) {
                    bundle2.putBoolean(next, ((Boolean) opt).booleanValue());
                } else if (opt instanceof Double) {
                    bundle2.putDouble(next, ((Double) opt).doubleValue());
                } else if (opt instanceof Integer) {
                    bundle2.putInt(next, ((Integer) opt).intValue());
                } else if (opt instanceof Long) {
                    bundle2.putLong(next, ((Long) opt).longValue());
                } else if (opt instanceof String) {
                    bundle2.putString(next, (String) opt);
                } else if (opt instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) opt;
                    if (jSONArray.length() != 0) {
                        int length = jSONArray.length();
                        int i = 0;
                        Object obj = null;
                        for (int i2 = 0; obj == null && i2 < length; i2++) {
                            if (!jSONArray.isNull(i2)) {
                                obj = jSONArray.opt(i2);
                            } else {
                                obj = null;
                            }
                        }
                        if (obj == null) {
                            String valueOf = String.valueOf(next);
                            int i3 = zze.b;
                            com.google.android.gms.ads.internal.util.client.zzo.g("Expected JSONArray with at least 1 non-null element for key:".concat(valueOf));
                        } else if (obj instanceof JSONObject) {
                            Parcelable[] parcelableArr = new Bundle[length];
                            while (i < length) {
                                if (!jSONArray.isNull(i)) {
                                    bundle = a(jSONArray.optJSONObject(i));
                                } else {
                                    bundle = null;
                                }
                                parcelableArr[i] = bundle;
                                i++;
                            }
                            bundle2.putParcelableArray(next, parcelableArr);
                        } else if (obj instanceof Number) {
                            double[] dArr = new double[jSONArray.length()];
                            while (i < length) {
                                dArr[i] = jSONArray.optDouble(i);
                                i++;
                            }
                            bundle2.putDoubleArray(next, dArr);
                        } else if (obj instanceof CharSequence) {
                            String[] strArr = new String[length];
                            while (i < length) {
                                if (!jSONArray.isNull(i)) {
                                    str = jSONArray.optString(i);
                                } else {
                                    str = null;
                                }
                                strArr[i] = str;
                                i++;
                            }
                            bundle2.putStringArray(next, strArr);
                        } else if (obj instanceof Boolean) {
                            boolean[] zArr = new boolean[length];
                            while (i < length) {
                                zArr[i] = jSONArray.optBoolean(i);
                                i++;
                            }
                            bundle2.putBooleanArray(next, zArr);
                        } else {
                            String format = String.format("JSONArray with unsupported type %s for key:%s", obj.getClass().getCanonicalName(), next);
                            int i4 = zze.b;
                            com.google.android.gms.ads.internal.util.client.zzo.g(format);
                        }
                    }
                } else if (opt instanceof JSONObject) {
                    bundle2.putBundle(next, a((JSONObject) opt));
                } else {
                    String valueOf2 = String.valueOf(next);
                    int i5 = zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.g("Unsupported type for key:".concat(valueOf2));
                }
            }
        }
        return bundle2;
    }

    public static String b(String str, JSONObject jSONObject, String... strArr) {
        JSONObject n = n(jSONObject, strArr);
        if (n == null) {
            return "";
        }
        return n.optString(strArr[0], "");
    }

    @InterfaceC5670cr1
    public static List c(@InterfaceC11300zs1 JSONArray jSONArray, @InterfaceC11300zs1 List list) throws JSONException {
        if (list == null) {
            list = new ArrayList();
        }
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                list.add(jSONArray.getString(i));
            }
        }
        return list;
    }

    public static List d(JsonReader jsonReader) throws IllegalStateException, IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(jsonReader.nextString());
        }
        jsonReader.endArray();
        return arrayList;
    }

    public static Map e(JsonReader jsonReader) throws IOException, IllegalStateException {
        HashMap hashMap = new HashMap();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            HashMap hashMap2 = new HashMap();
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                hashMap2.put(jsonReader.nextName(), jsonReader.nextString());
            }
            jsonReader.endObject();
            hashMap.put(nextName, hashMap2);
        }
        jsonReader.endObject();
        return hashMap;
    }

    public static JSONArray f(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException {
        JSONArray jSONArray = new JSONArray();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            JsonToken peek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(peek)) {
                jSONArray.put(f(jsonReader));
            } else if (JsonToken.BEGIN_OBJECT.equals(peek)) {
                jSONArray.put(i(jsonReader));
            } else if (JsonToken.BOOLEAN.equals(peek)) {
                jSONArray.put(jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(peek)) {
                jSONArray.put(jsonReader.nextDouble());
            } else if (JsonToken.STRING.equals(peek)) {
                jSONArray.put(jsonReader.nextString());
            } else {
                throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(peek)));
            }
        }
        jsonReader.endArray();
        return jSONArray;
    }

    public static JSONObject g(JSONObject jSONObject, String str) throws JSONException {
        try {
            return jSONObject.getJSONObject(str);
        } catch (JSONException unused) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        }
    }

    @InterfaceC11300zs1
    public static JSONObject h(JSONObject jSONObject, String... strArr) {
        JSONObject n = n(jSONObject, strArr);
        if (n == null) {
            return null;
        }
        return n.optJSONObject(strArr[1]);
    }

    public static JSONObject i(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException {
        JSONObject jSONObject = new JSONObject();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            JsonToken peek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(peek)) {
                jSONObject.put(nextName, f(jsonReader));
            } else if (JsonToken.BEGIN_OBJECT.equals(peek)) {
                jSONObject.put(nextName, i(jsonReader));
            } else if (JsonToken.BOOLEAN.equals(peek)) {
                jSONObject.put(nextName, jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(peek)) {
                jSONObject.put(nextName, jsonReader.nextDouble());
            } else if (JsonToken.STRING.equals(peek)) {
                jSONObject.put(nextName, jsonReader.nextString());
            } else {
                throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(peek)));
            }
        }
        jsonReader.endObject();
        return jSONObject;
    }

    public static void j(JsonWriter jsonWriter, JSONArray jSONArray) throws IOException {
        try {
            jsonWriter.beginArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                Object obj = jSONArray.get(i);
                if (obj instanceof String) {
                    jsonWriter.value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    k(jsonWriter, (JSONObject) obj);
                } else if (obj instanceof JSONArray) {
                    j(jsonWriter, (JSONArray) obj);
                } else {
                    String valueOf = String.valueOf(obj);
                    throw new JSONException("unable to write field: " + valueOf);
                }
            }
            jsonWriter.endArray();
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }

    public static void k(JsonWriter jsonWriter, JSONObject jSONObject) throws IOException {
        try {
            jsonWriter.beginObject();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    jsonWriter.name(next).value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.name(next).value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.name(next).value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    k(jsonWriter.name(next), (JSONObject) obj);
                } else if (obj instanceof JSONArray) {
                    j(jsonWriter.name(next), (JSONArray) obj);
                } else {
                    String valueOf = String.valueOf(obj);
                    throw new JSONException("unable to write field: " + valueOf);
                }
            }
            jsonWriter.endObject();
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }

    public static boolean l(boolean z, JSONObject jSONObject, String... strArr) {
        JSONObject n = n(jSONObject, strArr);
        if (n == null) {
            return false;
        }
        return n.optBoolean(strArr[strArr.length - 1], false);
    }

    public static String m(@InterfaceC11300zs1 zzfbz zzfbzVar) {
        if (zzfbzVar == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        try {
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            o(jsonWriter, zzfbzVar);
            jsonWriter.close();
            return stringWriter.toString();
        } catch (IOException e) {
            int i = zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("Error when writing JSON.", e);
            return null;
        }
    }

    @InterfaceC11300zs1
    public static JSONObject n(JSONObject jSONObject, String[] strArr) {
        for (int i = 0; i < strArr.length - 1; i = 1) {
            if (jSONObject == null) {
                return null;
            }
            jSONObject = jSONObject.optJSONObject(strArr[0]);
        }
        return jSONObject;
    }

    public static void o(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
        } else if (obj instanceof Boolean) {
            jsonWriter.value(((Boolean) obj).booleanValue());
        } else if (obj instanceof String) {
            jsonWriter.value((String) obj);
        } else if (obj instanceof zzfbz) {
            k(jsonWriter, ((zzfbz) obj).d);
        } else if (obj instanceof Map) {
            jsonWriter.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                if (key instanceof String) {
                    o(jsonWriter.name((String) key), entry.getValue());
                }
            }
            jsonWriter.endObject();
        } else if (obj instanceof List) {
            jsonWriter.beginArray();
            for (Object obj2 : (List) obj) {
                o(jsonWriter, obj2);
            }
            jsonWriter.endArray();
        } else {
            jsonWriter.nullValue();
        }
    }
}

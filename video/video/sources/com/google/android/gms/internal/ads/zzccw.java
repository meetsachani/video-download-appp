package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import o.C10453wN1;
import o.C10901yE;
import o.C3771Nr1;
import o.C4500Ve2;
import o.C5738d80;
import o.UE;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzccw implements zzbjw {
    public boolean a;

    public static int b(Context context, Map map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                com.google.android.gms.ads.internal.client.zzbb.b();
                i = com.google.android.gms.ads.internal.util.client.zzf.D(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                int i2 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.g("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        if (com.google.android.gms.ads.internal.util.zze.m()) {
            com.google.android.gms.ads.internal.util.zze.k("Parse pixels for " + str + ", got string " + str2 + ", int " + i + UE.h);
        }
        return i;
    }

    public static void c(zzcbk zzcbkVar, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzcbkVar.j(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                String format = String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2);
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.g(format);
                return;
            }
        }
        if (str2 != null) {
            zzcbkVar.c(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzcbkVar.J(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzcbkVar.K(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzcbkVar.m(Integer.parseInt(str5));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        int min;
        int min2;
        Context context;
        zzcbw zzcbwVar = (zzcbw) obj;
        String str = (String) map.get("action");
        if (str == null) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("Action missing from video GMSG.");
            return;
        }
        Integer num = null;
        Integer valueOf = map.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map.get("playerId"))) : null;
        Integer b = zzcbwVar.n() != null ? zzcbwVar.n().b() : null;
        if (valueOf != null && b != null && !valueOf.equals(b) && !str.equals("load")) {
            String format = String.format(Locale.US, "Event intended for player %s, but sent to player %d - event ignored", valueOf, b);
            int i2 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.f(format);
            return;
        }
        if (com.google.android.gms.ads.internal.util.client.zzo.j(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            com.google.android.gms.ads.internal.util.client.zzo.b("Video GMSG: " + str + C4500Ve2.b + jSONObject.toString());
        }
        if (str.equals(C3771Nr1.A.C)) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                com.google.android.gms.ads.internal.util.client.zzo.g("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                zzcbwVar.setBackgroundColor(Color.parseColor(str2));
            } catch (IllegalArgumentException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.g("Invalid color parameter in background video GMSG.");
            }
        } else if (str.equals("playerBackground")) {
            String str3 = (String) map.get("color");
            if (TextUtils.isEmpty(str3)) {
                com.google.android.gms.ads.internal.util.client.zzo.g("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                zzcbwVar.C(Color.parseColor(str3));
            } catch (IllegalArgumentException unused2) {
                com.google.android.gms.ads.internal.util.client.zzo.g("Invalid color parameter in playerBackground video GMSG.");
            }
        } else {
            int i3 = 0;
            if (str.equals("decoderProps")) {
                String str4 = (String) map.get("mimeTypes");
                if (str4 == null) {
                    com.google.android.gms.ads.internal.util.client.zzo.g("No MIME types specified for decoder properties inspection.");
                    HashMap hashMap = new HashMap();
                    hashMap.put("event", "decoderProps");
                    hashMap.put("error", "missingMimeTypes");
                    zzcbwVar.q("onVideoEvent", hashMap);
                    return;
                }
                HashMap hashMap2 = new HashMap();
                String[] split = str4.split(",");
                int length = split.length;
                while (i3 < length) {
                    String str5 = split[i3];
                    hashMap2.put(str5, com.google.android.gms.ads.internal.util.zzcj.a(str5.trim()));
                    i3++;
                }
                HashMap hashMap3 = new HashMap();
                hashMap3.put("event", "decoderProps");
                hashMap3.put("mimeTypes", hashMap2);
                zzcbwVar.q("onVideoEvent", hashMap3);
                return;
            }
            zzcbl n = zzcbwVar.n();
            if (n == null) {
                com.google.android.gms.ads.internal.util.client.zzo.g("Could not get underlay container for a video GMSG.");
                return;
            }
            boolean equals = str.equals("new");
            boolean equals2 = str.equals("position");
            if (!equals && !equals2) {
                zzcgd r = zzcbwVar.r();
                if (r != null) {
                    if (str.equals("timeupdate")) {
                        String str6 = (String) map.get("currentTime");
                        if (str6 == null) {
                            com.google.android.gms.ads.internal.util.client.zzo.g("currentTime parameter missing from timeupdate video GMSG.");
                            return;
                        }
                        try {
                            r.b8(Float.parseFloat(str6));
                            return;
                        } catch (NumberFormatException unused3) {
                            com.google.android.gms.ads.internal.util.client.zzo.g("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                            return;
                        }
                    } else if (str.equals(C10453wN1.I1)) {
                        r.t();
                        return;
                    }
                }
                zzcbk a = n.a();
                if (a == null) {
                    HashMap hashMap4 = new HashMap();
                    hashMap4.put("event", "no_video_view");
                    zzcbwVar.q("onVideoEvent", hashMap4);
                    return;
                } else if (str.equals("click")) {
                    int b2 = b(zzcbwVar.getContext(), map, "x", 0);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, b2, b(context, map, C5738d80.b, 0), 0);
                    a.I(obtain);
                    obtain.recycle();
                    return;
                } else if (str.equals("currentTime")) {
                    String str7 = (String) map.get("time");
                    if (str7 == null) {
                        com.google.android.gms.ads.internal.util.client.zzo.g("Time parameter missing from currentTime video GMSG.");
                        return;
                    }
                    try {
                        a.H((int) (Float.parseFloat(str7) * 1000.0f));
                        return;
                    } catch (NumberFormatException unused4) {
                        com.google.android.gms.ads.internal.util.client.zzo.g("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                        return;
                    }
                } else if (str.equals("hide")) {
                    a.setVisibility(4);
                    return;
                } else if (str.equals("remove")) {
                    a.setVisibility(8);
                    return;
                } else if (str.equals("load")) {
                    a.C(valueOf);
                    return;
                } else if (str.equals("loadControl")) {
                    c(a, map);
                    return;
                } else if (str.equals("muted")) {
                    if (Boolean.parseBoolean((String) map.get("muted"))) {
                        a.D();
                        return;
                    } else {
                        a.r();
                        return;
                    }
                } else if (str.equals("pause")) {
                    a.F();
                    return;
                } else if (str.equals("play")) {
                    a.G();
                    return;
                } else if (str.equals("show")) {
                    a.setVisibility(0);
                    return;
                } else if (str.equals("src")) {
                    String str8 = (String) map.get("src");
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.n2)).booleanValue() && TextUtils.isEmpty(str8)) {
                        com.google.android.gms.ads.internal.util.client.zzo.g("Src parameter missing from src video GMSG.");
                        return;
                    }
                    if (map.containsKey("periodicReportIntervalMs")) {
                        try {
                            num = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                        } catch (NumberFormatException unused5) {
                            com.google.android.gms.ads.internal.util.client.zzo.g("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
                        }
                    }
                    String[] strArr = {str8};
                    String str9 = (String) map.get("demuxed");
                    if (str9 != null) {
                        try {
                            JSONArray jSONArray = new JSONArray(str9);
                            ArrayList arrayList = new ArrayList();
                            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                                String string = jSONArray.getString(i4);
                                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.n2)).booleanValue() || !TextUtils.isEmpty(string)) {
                                    arrayList.add(string);
                                }
                            }
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.n2)).booleanValue() && arrayList.isEmpty()) {
                                com.google.android.gms.ads.internal.util.client.zzo.g("All demuxed URLs are empty for playback: " + str9);
                                return;
                            }
                            strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
                        } catch (JSONException unused6) {
                            com.google.android.gms.ads.internal.util.client.zzo.g("Malformed demuxed URL list for playback: ".concat(str9));
                            strArr = new String[]{str8};
                        }
                    }
                    if (num != null) {
                        zzcbwVar.Q(num.intValue());
                    }
                    a.n(str8, strArr);
                    return;
                } else if (str.equals("touchMove")) {
                    Context context2 = zzcbwVar.getContext();
                    a.q(b(context2, map, "dx", 0), b(context2, map, "dy", 0));
                    if (this.a) {
                        return;
                    }
                    zzcbwVar.Q0();
                    this.a = true;
                    return;
                } else if (str.equals("volume")) {
                    String str10 = (String) map.get("volume");
                    if (str10 == null) {
                        com.google.android.gms.ads.internal.util.client.zzo.g("Level parameter missing from volume video GMSG.");
                        return;
                    }
                    try {
                        a.p(Float.parseFloat(str10));
                        return;
                    } catch (NumberFormatException unused7) {
                        com.google.android.gms.ads.internal.util.client.zzo.g("Could not parse volume parameter from volume video GMSG: ".concat(str10));
                        return;
                    }
                } else if (str.equals("watermark")) {
                    a.A();
                    return;
                } else {
                    com.google.android.gms.ads.internal.util.client.zzo.g("Unknown video action: ".concat(str));
                    return;
                }
            }
            Context context3 = zzcbwVar.getContext();
            int b3 = b(context3, map, "x", 0);
            int b4 = b(context3, map, C5738d80.b, 0);
            int b5 = b(context3, map, "w", -1);
            zzbcm zzbcmVar = zzbcv.g4;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).booleanValue()) {
                if (com.google.android.gms.ads.internal.util.zze.m()) {
                    com.google.android.gms.ads.internal.util.zze.k("Calculate width with original width " + b5 + ", videoHost.getVideoBoundingWidth() " + zzcbwVar.h() + ", x " + b3 + UE.h);
                }
                min = Math.min(b5, zzcbwVar.h() - b3);
            } else if (b5 == -1) {
                min = zzcbwVar.h();
            } else {
                min = Math.min(b5, zzcbwVar.h());
            }
            int i5 = min;
            int b6 = b(context3, map, C10901yE.i, -1);
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).booleanValue()) {
                if (com.google.android.gms.ads.internal.util.zze.m()) {
                    com.google.android.gms.ads.internal.util.zze.k("Calculate height with original height " + b6 + ", videoHost.getVideoBoundingHeight() " + zzcbwVar.g() + ", y " + b4 + UE.h);
                }
                min2 = Math.min(b6, zzcbwVar.g() - b4);
            } else if (b6 == -1) {
                min2 = zzcbwVar.g();
            } else {
                min2 = Math.min(b6, zzcbwVar.g());
            }
            int i6 = min2;
            try {
                i3 = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused8) {
            }
            int i7 = i3;
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
            if (equals && n.a() == null) {
                n.d(b3, b4, i5, i6, i7, parseBoolean, new zzcbv((String) map.get("flags")));
                zzcbk a2 = n.a();
                if (a2 != null) {
                    c(a2, map);
                    return;
                }
                return;
            }
            n.c(b3, b4, i5, i6);
        }
    }
}

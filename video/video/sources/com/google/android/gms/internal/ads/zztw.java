package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import o.C4128Rj1;
import o.C4208Se1;
import o.C4305Te1;
import o.C4402Ue1;
import o.C4499Ve1;
import o.C5137af1;
import o.C9811tl1;
import o.HS1;
import o.InterfaceC11300zs1;
import o.InterfaceC8710pF0;
import o.OB;

@SuppressLint({"InlinedApi"})
/* loaded from: classes2.dex */
public final class zztw {
    @InterfaceC8710pF0("MediaCodecUtil.class")
    public static final HashMap a = new HashMap();
    public static final /* synthetic */ int b = 0;

    @InterfaceC11300zs1
    public static zztc a() throws zztq {
        List d = d(C4128Rj1.N, false, false);
        if (d.isEmpty()) {
            return null;
        }
        return (zztc) d.get(0);
    }

    @InterfaceC11300zs1
    public static String b(zzz zzzVar) {
        Pair a2;
        String str = zzzVar.f301o;
        if (C4128Rj1.S.equals(str)) {
            return C4128Rj1.R;
        }
        if (C4128Rj1.w.equals(str) && (a2 = zzdh.a(zzzVar)) != null) {
            int intValue = ((Integer) a2.first).intValue();
            if (intValue != 16 && intValue != 256) {
                if (intValue == 512) {
                    return "video/avc";
                }
                if (intValue == 1024) {
                    return C4128Rj1.n;
                }
            } else {
                return C4128Rj1.k;
            }
        }
        if (!"video/mv-hevc".equals(str)) {
            return null;
        }
        return C4128Rj1.k;
    }

    public static List c(zztl zztlVar, zzz zzzVar, boolean z, boolean z2) throws zztq {
        String b2 = b(zzzVar);
        if (b2 == null) {
            return zzfyc.F();
        }
        return zztlVar.a(b2, z, z2);
    }

    public static synchronized List d(String str, boolean z, boolean z2) throws zztq {
        synchronized (zztw.class) {
            try {
                zztp zztpVar = new zztp(str, z, z2);
                HashMap hashMap = a;
                List list = (List) hashMap.get(zztpVar);
                if (list != null) {
                    return list;
                }
                ArrayList g = g(zztpVar, new zztt(z, z2, str.equals("video/mv-hevc")));
                if (z) {
                    g.isEmpty();
                }
                if (C4128Rj1.N.equals(str)) {
                    if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && g.size() == 1 && ((zztc) g.get(0)).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                        g.add(zztc.c("OMX.google.raw.decoder", C4128Rj1.N, C4128Rj1.N, null, false, true, false, false, false));
                    }
                    h(g, new zztu() { // from class: com.google.android.gms.internal.ads.zztn
                        @Override // com.google.android.gms.internal.ads.zztu
                        public final int b(Object obj) {
                            int i = zztw.b;
                            String str2 = ((zztc) obj).a;
                            if (str2.startsWith("OMX.google") || str2.startsWith("c2.android")) {
                                return 1;
                            }
                            if (Build.VERSION.SDK_INT >= 26 || !str2.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                                return 0;
                            }
                            return -1;
                        }
                    });
                }
                if (Build.VERSION.SDK_INT < 32 && g.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zztc) g.get(0)).a)) {
                    g.add((zztc) g.remove(0));
                }
                zzfyc B = zzfyc.B(g);
                hashMap.put(zztpVar, B);
                return B;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @HS1({"#2.sampleMimeType"})
    public static List e(zztl zztlVar, zzz zzzVar, boolean z, boolean z2) throws zztq {
        List a2 = zztlVar.a(zzzVar.f301o, z, z2);
        List c = c(zztlVar, zzzVar, z, z2);
        int i = zzfyc.Z;
        zzfxz zzfxzVar = new zzfxz();
        zzfxzVar.i(a2);
        zzfxzVar.i(c);
        return zzfxzVar.j();
    }

    @OB
    public static List f(List list, final zzz zzzVar) {
        ArrayList arrayList = new ArrayList(list);
        h(arrayList, new zztu() { // from class: com.google.android.gms.internal.ads.zzto
            @Override // com.google.android.gms.internal.ads.zztu
            public final int b(Object obj) {
                int i = zztw.b;
                if (((zztc) obj).d(zzz.this)) {
                    return 1;
                }
                return 0;
            }
        });
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0115 A[Catch: Exception -> 0x011d, TryCatch #1 {Exception -> 0x011d, blocks: (B:63:0x00e3, B:70:0x00fc, B:76:0x010f, B:78:0x0115, B:86:0x012f, B:88:0x0137, B:89:0x013c, B:91:0x014c, B:93:0x0154, B:82:0x0122), top: B:124:0x00e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0122 A[Catch: Exception -> 0x011d, TryCatch #1 {Exception -> 0x011d, blocks: (B:63:0x00e3, B:70:0x00fc, B:76:0x010f, B:78:0x0115, B:86:0x012f, B:88:0x0137, B:89:0x013c, B:91:0x014c, B:93:0x0154, B:82:0x0122), top: B:124:0x00e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0137 A[Catch: Exception -> 0x011d, TryCatch #1 {Exception -> 0x011d, blocks: (B:63:0x00e3, B:70:0x00fc, B:76:0x010f, B:78:0x0115, B:86:0x012f, B:88:0x0137, B:89:0x013c, B:91:0x014c, B:93:0x0154, B:82:0x0122), top: B:124:0x00e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013c A[Catch: Exception -> 0x011d, TryCatch #1 {Exception -> 0x011d, blocks: (B:63:0x00e3, B:70:0x00fc, B:76:0x010f, B:78:0x0115, B:86:0x012f, B:88:0x0137, B:89:0x013c, B:91:0x014c, B:93:0x0154, B:82:0x0122), top: B:124:0x00e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList g(zztp zztpVar, zztr zztrVar) throws zztq {
        int i;
        String str;
        String str2;
        String str3;
        boolean z;
        int i2;
        String str4;
        boolean z2;
        boolean i3;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        zztp zztpVar2 = zztpVar;
        zztr zztrVar2 = zztrVar;
        try {
            ArrayList arrayList = new ArrayList();
            String str5 = zztpVar2.a;
            int a2 = zztrVar2.a();
            boolean d = zztrVar2.d();
            int i4 = 0;
            while (i4 < a2) {
                MediaCodecInfo z7 = zztrVar2.z(i4);
                if (Build.VERSION.SDK_INT >= 29 && C4499Ve1.a(z7)) {
                    i = i4;
                } else {
                    int i5 = i4;
                    String name = z7.getName();
                    if (!z7.isEncoder()) {
                        if (!d) {
                            if (!name.endsWith(".secure")) {
                            }
                        }
                        String[] supportedTypes = z7.getSupportedTypes();
                        int length = supportedTypes.length;
                        int i6 = 0;
                        while (true) {
                            if (i6 < length) {
                                str = supportedTypes[i6];
                                if (str.equalsIgnoreCase(str5)) {
                                    break;
                                }
                                i6++;
                            } else if (str5.equals(C4128Rj1.w)) {
                                if ("OMX.MS.HEVCDV.Decoder".equals(name)) {
                                    str = "video/hevcdv";
                                } else {
                                    if (!"OMX.RTK.video.decoder".equals(name)) {
                                        if ("OMX.realtek.video.decoder.tunneled".equals(name)) {
                                        }
                                        str = null;
                                    }
                                    str = "video/dv_hevc";
                                }
                            } else if (str5.equals("video/mv-hevc")) {
                                if ("c2.qti.mvhevc.decoder".equals(name) || "c2.qti.mvhevc.decoder.secure".equals(name)) {
                                    str = "video/x-mvhevc";
                                }
                                str = null;
                            } else if (str5.equals(C4128Rj1.f0) && "OMX.lge.alac.decoder".equals(name)) {
                                str = "audio/x-lg-alac";
                            } else if (str5.equals(C4128Rj1.e0) && "OMX.lge.flac.decoder".equals(name)) {
                                str = "audio/x-lg-flac";
                            } else {
                                if (str5.equals(C4128Rj1.Q) && "OMX.lge.ac3.decoder".equals(name)) {
                                    str = "audio/lg-ac3";
                                }
                                str = null;
                            }
                        }
                        if (str != null) {
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = z7.getCapabilitiesForType(str);
                                boolean b2 = zztrVar2.b("tunneled-playback", str, capabilitiesForType);
                                boolean c = zztrVar2.c("tunneled-playback", str, capabilitiesForType);
                                if (!zztpVar2.c) {
                                    if (!c) {
                                        boolean b3 = zztrVar2.b("secure-playback", str, capabilitiesForType);
                                        boolean c2 = zztrVar2.c("secure-playback", str, capabilitiesForType);
                                        z = zztpVar2.b;
                                        if (!z || !c2) {
                                            if (z) {
                                                if (b3) {
                                                    b3 = true;
                                                }
                                            }
                                            i2 = Build.VERSION.SDK_INT;
                                            if (i2 < 29) {
                                                z2 = C4402Ue1.a(z7);
                                                str4 = ".secure";
                                            } else if (!i(z7, str5)) {
                                                str4 = ".secure";
                                                z2 = true;
                                            } else {
                                                str4 = ".secure";
                                                z2 = false;
                                            }
                                            i3 = i(z7, str5);
                                            if (i2 < 29) {
                                                z3 = C4208Se1.a(z7);
                                            } else {
                                                String a3 = zzfui.a(z7.getName());
                                                if (!a3.startsWith("omx.google.") && !a3.startsWith("c2.android.") && !a3.startsWith("c2.google.")) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                            }
                                            try {
                                                try {
                                                    if (!d) {
                                                        if (z != b3) {
                                                            z4 = true;
                                                        }
                                                        boolean z8 = z3;
                                                        i = i5;
                                                        str2 = str;
                                                        str3 = name;
                                                        arrayList.add(zztc.c(name, str5, str2, capabilitiesForType, z2, i3, z8, false, false));
                                                    } else {
                                                        z4 = b3;
                                                    }
                                                    arrayList.add(zztc.c(name, str5, str2, capabilitiesForType, z2, i3, z8, false, false));
                                                } catch (Exception e) {
                                                    e = e;
                                                    zzdx.c(C5137af1.a, "Failed to query codec " + str3 + " (" + str2 + C9811tl1.d);
                                                    throw e;
                                                }
                                                str3 = name;
                                            } catch (Exception e2) {
                                                e = e2;
                                                str3 = name;
                                                zzdx.c(C5137af1.a, "Failed to query codec " + str3 + " (" + str2 + C9811tl1.d);
                                                throw e;
                                            }
                                            if (!d || z) {
                                                z5 = z3;
                                                i = i5;
                                                str2 = str;
                                                str3 = name;
                                                z6 = z2;
                                                if (!d && z4) {
                                                    arrayList.add(zztc.c(str3 + str4, str5, str2, capabilitiesForType, z6, i3, z5, false, true));
                                                    return arrayList;
                                                }
                                            }
                                            boolean z82 = z3;
                                            i = i5;
                                            str2 = str;
                                        }
                                    }
                                    i = i5;
                                } else {
                                    if (!b2) {
                                        i = i5;
                                    }
                                    boolean b32 = zztrVar2.b("secure-playback", str, capabilitiesForType);
                                    boolean c22 = zztrVar2.c("secure-playback", str, capabilitiesForType);
                                    z = zztpVar2.b;
                                    if (!z) {
                                    }
                                    if (z) {
                                    }
                                    i2 = Build.VERSION.SDK_INT;
                                    if (i2 < 29) {
                                    }
                                    i3 = i(z7, str5);
                                    if (i2 < 29) {
                                    }
                                    if (!d) {
                                    }
                                    if (!d) {
                                    }
                                    z5 = z3;
                                    i = i5;
                                    str2 = str;
                                    str3 = name;
                                    z6 = z2;
                                    if (!d) {
                                        arrayList.add(zztc.c(str3 + str4, str5, str2, capabilitiesForType, z6, i3, z5, false, true));
                                        return arrayList;
                                    }
                                    continue;
                                }
                            } catch (Exception e3) {
                                e = e3;
                                str2 = str;
                            }
                        }
                    }
                    i = i5;
                }
                i4 = i + 1;
                zztpVar2 = zztpVar;
                zztrVar2 = zztrVar;
            }
            return arrayList;
        } catch (Exception e4) {
            throw new zztq(e4, null);
        }
    }

    public static void h(List list, final zztu zztuVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zztm
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int i = zztw.b;
                zztu zztuVar2 = zztu.this;
                return zztuVar2.b(obj2) - zztuVar2.b(obj);
            }
        });
    }

    public static boolean i(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C4305Te1.a(mediaCodecInfo);
        }
        if (zzay.h(str)) {
            return true;
        }
        String a2 = zzfui.a(mediaCodecInfo.getName());
        if (a2.startsWith("arc.")) {
            return false;
        }
        if (a2.startsWith("omx.google.") || a2.startsWith("omx.ffmpeg.") || ((a2.startsWith("omx.sec.") && a2.contains(".sw.")) || a2.equals("omx.qcom.video.decoder.hevcswvdec") || a2.startsWith("c2.android.") || a2.startsWith("c2.google."))) {
            return true;
        }
        if (!a2.startsWith("omx.") && !a2.startsWith("c2.")) {
            return true;
        }
        return false;
    }
}

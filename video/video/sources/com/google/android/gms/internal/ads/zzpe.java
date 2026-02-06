package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import o.C10478wT2;
import o.C10764xg;
import o.C4128Rj1;
import o.C6566gU0;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;

/* loaded from: classes2.dex */
public final class zzpe {
    public static final zzpe c = new zzpe(zzfyc.G(zzpd.d));
    @SuppressLint({"InlinedApi"})
    public static final zzfyc d = zzfyc.J(2, 5, 6);
    @InterfaceC5056aJ2
    public static final zzfyf e;
    public final SparseArray a = new SparseArray();
    public final int b;

    static {
        zzfye zzfyeVar = new zzfye();
        zzfyeVar.a(5, 6);
        zzfyeVar.a(17, 6);
        zzfyeVar.a(7, 6);
        zzfyeVar.a(30, 10);
        zzfyeVar.a(18, 6);
        zzfyeVar.a(6, 8);
        zzfyeVar.a(8, 8);
        zzfyeVar.a(14, 8);
        e = zzfyeVar.c();
    }

    public zzpe(List list) {
        for (int i = 0; i < list.size(); i++) {
            zzpd zzpdVar = (zzpd) list.get(i);
            this.a.put(zzpdVar.a, zzpdVar);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a.size(); i3++) {
            i2 = Math.max(i2, ((zzpd) this.a.valueAt(i3)).b);
        }
        this.b = i2;
    }

    @InterfaceC11300zs1
    public static Uri a() {
        if (f()) {
            return Settings.Global.getUriFor(C10764xg.h);
        }
        return null;
    }

    @SuppressLint({"UnprotectedReceiver"})
    public static zzpe c(Context context, zze zzeVar, @InterfaceC11300zs1 zzpk zzpkVar) {
        return d(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), zzeVar, zzpkVar);
    }

    @SuppressLint({"InlinedApi"})
    public static zzpe d(Context context, @InterfaceC11300zs1 Intent intent, zze zzeVar, @InterfaceC11300zs1 zzpk zzpkVar) {
        AudioDeviceInfo[] audioDeviceInfoArr;
        boolean z;
        boolean isDirectPlaybackSupported;
        List directProfilesForAttributes;
        int encapsulationType;
        int format;
        int[] channelMasks;
        int[] channelMasks2;
        List audioDevicesForAttributes;
        AudioManager c2 = zzcj.c(context);
        if (zzpkVar == null) {
            zzpk zzpkVar2 = null;
            if (Build.VERSION.SDK_INT >= 33) {
                try {
                    audioDevicesForAttributes = c2.getAudioDevicesForAttributes(zzeVar.a().a);
                    if (!audioDevicesForAttributes.isEmpty()) {
                        zzpkVar2 = new zzpk((AudioDeviceInfo) audioDevicesForAttributes.get(0));
                    }
                } catch (RuntimeException unused) {
                }
            }
            zzpkVar = zzpkVar2;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 && (zzeu.n(context) || zzeu.j(context))) {
            directProfilesForAttributes = c2.getDirectProfilesForAttributes(zzeVar.a().a);
            HashMap hashMap = new HashMap();
            hashMap.put(2, new HashSet(zzgbf.h(12)));
            for (int i2 = 0; i2 < directProfilesForAttributes.size(); i2++) {
                AudioProfile a = C10478wT2.a(directProfilesForAttributes.get(i2));
                encapsulationType = a.getEncapsulationType();
                if (encapsulationType != 1) {
                    format = a.getFormat();
                    if (zzeu.k(format) || e.containsKey(Integer.valueOf(format))) {
                        Integer valueOf = Integer.valueOf(format);
                        if (!hashMap.containsKey(valueOf)) {
                            channelMasks = a.getChannelMasks();
                            hashMap.put(valueOf, new HashSet(zzgbf.h(channelMasks)));
                        } else {
                            Set set = (Set) hashMap.get(valueOf);
                            set.getClass();
                            channelMasks2 = a.getChannelMasks();
                            set.addAll(zzgbf.h(channelMasks2));
                        }
                    }
                }
            }
            int i3 = zzfyc.Z;
            zzfxz zzfxzVar = new zzfxz();
            for (Map.Entry entry : hashMap.entrySet()) {
                zzfxzVar.g(new zzpd(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
            }
            return new zzpe(zzfxzVar.j());
        }
        if (zzpkVar == null) {
            audioDeviceInfoArr = c2.getDevices(2);
        } else {
            audioDeviceInfoArr = new AudioDeviceInfo[]{zzpkVar.a};
        }
        zzfyg zzfygVar = new zzfyg();
        zzfygVar.h(8, 7);
        if (i >= 31) {
            zzfygVar.h(26, 27);
        }
        if (i >= 33) {
            zzfygVar.g(30);
        }
        zzfyh j = zzfygVar.j();
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            if (j.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                return c;
            }
        }
        zzfyg zzfygVar2 = new zzfyg();
        zzfygVar2.g(2);
        if (Build.VERSION.SDK_INT >= 29 && (zzeu.n(context) || zzeu.j(context))) {
            int i4 = zzfyc.Z;
            zzfxz zzfxzVar2 = new zzfxz();
            zzgai it = e.keySet().iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int intValue = num.intValue();
                if (Build.VERSION.SDK_INT >= zzeu.C(intValue)) {
                    isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), zzeVar.a().a);
                    if (isDirectPlaybackSupported) {
                        zzfxzVar2.g(num);
                    }
                }
            }
            zzfxzVar2.g(2);
            zzfygVar2.i(zzfxzVar2.j());
            return new zzpe(e(zzgbf.i(zzfygVar2.j()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        if (Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        if ((z || f()) && Settings.Global.getInt(contentResolver, C10764xg.h, 0) == 1) {
            zzfygVar2.i(d);
        }
        if (intent != null && !z && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 1) {
            int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
            if (intArrayExtra != null) {
                zzfygVar2.i(zzgbf.h(intArrayExtra));
            }
            return new zzpe(e(zzgbf.i(zzfygVar2.j()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
        }
        return new zzpe(e(zzgbf.i(zzfygVar2.j()), 10));
    }

    public static zzfyc e(@InterfaceC11300zs1 int[] iArr, int i) {
        int i2 = zzfyc.Z;
        zzfxz zzfxzVar = new zzfxz();
        for (int i3 : iArr) {
            zzfxzVar.g(new zzpd(i3, i));
        }
        return zzfxzVar.j();
    }

    public static boolean f() {
        String str = Build.MANUFACTURER;
        if (!str.equals("Amazon") && !str.equals("Xiaomi")) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
        if (com.google.android.gms.internal.ads.zzeu.h(r9.a, 30) == false) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bf A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    @InterfaceC11300zs1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair b(zzz zzzVar, zze zzeVar) {
        SparseArray sparseArray;
        int D;
        String str = zzzVar.f301o;
        str.getClass();
        int a = zzay.a(str, zzzVar.k);
        if (e.containsKey(Integer.valueOf(a))) {
            int i = 8;
            if (a == 18) {
                if (!zzeu.h(this.a, 18)) {
                    a = 6;
                    sparseArray = this.a;
                    if (zzeu.h(sparseArray, a)) {
                        zzpd zzpdVar = (zzpd) sparseArray.get(a);
                        zzpdVar.getClass();
                        int i2 = zzzVar.E;
                        if (i2 != -1 && a != 18) {
                            if (str.equals(C4128Rj1.Y) && Build.VERSION.SDK_INT < 33) {
                                if (i2 > 10) {
                                    return null;
                                }
                            } else if (!zzpdVar.b(i2)) {
                                return null;
                            }
                        } else {
                            int i3 = zzzVar.F;
                            if (i3 == -1) {
                                i3 = 48000;
                            }
                            i2 = zzpdVar.a(i3, zzeVar);
                        }
                        int i4 = Build.VERSION.SDK_INT;
                        if (i4 <= 28) {
                            if (i2 != 7) {
                                if (i2 == 3 || i2 == 4 || i2 == 5) {
                                    i = 6;
                                }
                            }
                            if (i4 <= 26 && "fugu".equals(Build.DEVICE) && i == 1) {
                                i = 2;
                            }
                            D = zzeu.D(i);
                            if (D == 0) {
                                return Pair.create(Integer.valueOf(a), Integer.valueOf(D));
                            }
                            return null;
                        }
                        i = i2;
                        if (i4 <= 26) {
                            i = 2;
                        }
                        D = zzeu.D(i);
                        if (D == 0) {
                        }
                    } else {
                        return null;
                    }
                } else {
                    a = 18;
                }
            }
            if (a == 8) {
                if (zzeu.h(this.a, 8)) {
                    a = 8;
                }
                a = 7;
                sparseArray = this.a;
                if (zzeu.h(sparseArray, a)) {
                }
            }
            if (a == 30) {
            }
            sparseArray = this.a;
            if (zzeu.h(sparseArray, a)) {
            }
        } else {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r1 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        boolean contentEquals;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzpe)) {
            return false;
        }
        zzpe zzpeVar = (zzpe) obj;
        SparseArray sparseArray = this.a;
        SparseArray sparseArray2 = zzpeVar.a;
        String str = zzeu.a;
        if (Build.VERSION.SDK_INT >= 31) {
            contentEquals = sparseArray.contentEquals(sparseArray2);
        } else {
            int size = sparseArray.size();
            if (size == sparseArray2.size()) {
                for (int i = 0; i < size; i++) {
                    if (!Objects.equals(sparseArray.valueAt(i), sparseArray2.get(sparseArray.keyAt(i)))) {
                        break;
                    }
                }
                if (this.b == zzpeVar.b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str = zzeu.a;
        int i2 = Build.VERSION.SDK_INT;
        SparseArray sparseArray = this.a;
        if (i2 >= 31) {
            i = sparseArray.contentHashCode();
        } else {
            int i3 = 17;
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                i3 = (((i3 * 31) + sparseArray.keyAt(i4)) * 31) + Objects.hashCode(sparseArray.valueAt(i4));
            }
            i = i3;
        }
        return this.b + (i * 31);
    }

    public final String toString() {
        String obj = this.a.toString();
        return "AudioCapabilities[maxChannelCount=" + this.b + ", audioProfiles=" + obj + C6566gU0.g;
    }
}

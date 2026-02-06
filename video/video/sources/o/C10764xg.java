package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.provider.Settings;
import android.util.Pair;
import java.util.Arrays;
import o.AbstractC5317bO0;
import o.AbstractC6044eO0;
import o.AbstractC9481sO0;

@Deprecated
/* renamed from: o.xg  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10764xg {
    public static final int c = 10;
    @InterfaceC5056aJ2
    public static final int d = 48000;
    public static final C10764xg e = new C10764xg(new int[]{2}, 10);
    public static final AbstractC5317bO0<Integer> f = AbstractC5317bO0.U(2, 5, 6);
    public static final AbstractC6044eO0<Integer, Integer> g = new AbstractC6044eO0.b().i(5, 6).i(17, 6).i(7, 6).i(30, 10).i(18, 6).i(6, 8).i(8, 8).i(14, 8).d();
    public static final String h = "external_surround_sound_enabled";
    public final int[] a;
    public final int b;

    @ES1(23)
    /* renamed from: o.xg$a */
    /* loaded from: classes2.dex */
    public static final class a {
        @K40
        private static final AbstractC9481sO0<Integer> a() {
            AbstractC9481sO0.a b = new AbstractC9481sO0.a().b(8, 7);
            int i = TD2.a;
            if (i >= 31) {
                b.b(26, 27);
            }
            if (i >= 33) {
                b.g(30);
            }
            return b.e();
        }

        @K40
        public static final boolean b(Context context) {
            AudioDeviceInfo[] devices = ((AudioManager) C9542sf.g((AudioManager) context.getSystemService("audio"))).getDevices(2);
            AbstractC9481sO0<Integer> a = a();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (a.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return true;
                }
            }
            return false;
        }
    }

    @ES1(29)
    /* renamed from: o.xg$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public static final AudioAttributes a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

        @K40
        public static AbstractC5317bO0<Integer> a() {
            boolean isDirectPlaybackSupported;
            AbstractC5317bO0.a r = AbstractC5317bO0.r();
            AbstractC6237fB2 it = C10764xg.g.keySet().iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int intValue = num.intValue();
                if (TD2.a >= 34 || intValue != 30) {
                    isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), a);
                    if (isDirectPlaybackSupported) {
                        r.g(num);
                    }
                }
            }
            r.g(2);
            return r.e();
        }

        @K40
        public static int b(int i, int i2) {
            boolean isDirectPlaybackSupported;
            for (int i3 = 10; i3 > 0; i3--) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(TD2.S(i3)).build(), a);
                if (isDirectPlaybackSupported) {
                    return i3;
                }
            }
            return 0;
        }
    }

    public C10764xg(@InterfaceC11300zs1 int[] iArr, int i) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.a = new int[0];
        }
        this.b = i;
    }

    public static boolean b() {
        if (TD2.a >= 17) {
            String str = TD2.c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static C10764xg c(Context context) {
        return d(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    @SuppressLint({"InlinedApi"})
    public static C10764xg d(Context context, @InterfaceC11300zs1 Intent intent) {
        int i = TD2.a;
        if (i >= 23 && a.b(context)) {
            return e;
        }
        AbstractC9481sO0.a aVar = new AbstractC9481sO0.a();
        if (b() && Settings.Global.getInt(context.getContentResolver(), h, 0) == 1) {
            aVar.c(f);
        }
        if (i >= 29 && (TD2.Z0(context) || TD2.S0(context))) {
            aVar.c(b.a());
            return new C10764xg(C7775lT0.B(aVar.e()), 10);
        } else if (intent != null && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 1) {
            int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
            if (intArrayExtra != null) {
                aVar.c(C7775lT0.c(intArrayExtra));
            }
            return new C10764xg(C7775lT0.B(aVar.e()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10));
        } else {
            AbstractC9481sO0 e2 = aVar.e();
            if (!e2.isEmpty()) {
                return new C10764xg(C7775lT0.B(e2), 10);
            }
            return e;
        }
    }

    public static int e(int i) {
        int i2 = TD2.a;
        if (i2 <= 28) {
            if (i == 7) {
                i = 8;
            } else if (i == 3 || i == 4 || i == 5) {
                i = 6;
            }
        }
        if (i2 <= 26 && "fugu".equals(TD2.b) && i == 1) {
            i = 2;
        }
        return TD2.S(i);
    }

    @InterfaceC11300zs1
    public static Uri g() {
        if (b()) {
            return Settings.Global.getUriFor(h);
        }
        return null;
    }

    public static int i(int i, int i2) {
        if (TD2.a >= 29) {
            return b.b(i, i2);
        }
        return ((Integer) C9542sf.g(g.getOrDefault(Integer.valueOf(i), 0))).intValue();
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10764xg)) {
            return false;
        }
        C10764xg c10764xg = (C10764xg) obj;
        if (Arrays.equals(this.a, c10764xg.a) && this.b == c10764xg.b) {
            return true;
        }
        return false;
    }

    @InterfaceC11300zs1
    public Pair<Integer, Integer> f(C10833xx0 c10833xx0) {
        int f2 = C4128Rj1.f((String) C9542sf.g(c10833xx0.g1), c10833xx0.d1);
        if (!g.containsKey(Integer.valueOf(f2))) {
            return null;
        }
        if (f2 == 18 && !k(18)) {
            f2 = 6;
        } else if ((f2 == 8 && !k(8)) || (f2 == 30 && !k(30))) {
            f2 = 7;
        }
        if (!k(f2)) {
            return null;
        }
        int i = c10833xx0.t1;
        if (i != -1 && f2 != 18) {
            if (c10833xx0.g1.equals(C4128Rj1.Y)) {
                if (i > 10) {
                    return null;
                }
            } else if (i > this.b) {
                return null;
            }
        } else {
            int i2 = c10833xx0.u1;
            if (i2 == -1) {
                i2 = 48000;
            }
            i = i(f2, i2);
        }
        int e2 = e(i);
        if (e2 == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(f2), Integer.valueOf(e2));
    }

    public int h() {
        return this.b;
    }

    public int hashCode() {
        return this.b + (Arrays.hashCode(this.a) * 31);
    }

    public boolean j(C10833xx0 c10833xx0) {
        if (f(c10833xx0) != null) {
            return true;
        }
        return false;
    }

    public boolean k(int i) {
        if (Arrays.binarySearch(this.a, i) >= 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", supportedEncodings=" + Arrays.toString(this.a) + C6566gU0.g;
    }
}

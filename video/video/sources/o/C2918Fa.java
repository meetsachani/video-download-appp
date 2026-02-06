package o;

import com.google.firebase.sessions.settings.RemoteSettings;

/* renamed from: o.Fa  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2918Fa {

    /* renamed from: o.Fa$a */
    /* loaded from: classes3.dex */
    public static class a {
        public static final int[] a;

        static {
            int[] iArr = new int[EnumC3047Gh2.values().length];
            a = iArr;
            try {
                iArr[EnumC3047Gh2.FB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC3047Gh2.INSTA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[EnumC3047Gh2.LIKEE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[EnumC3047Gh2.TIKTOK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[EnumC3047Gh2.THREADS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[EnumC3047Gh2.SNACK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[EnumC3047Gh2.TWITTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[EnumC3047Gh2.PINTEREST.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[EnumC3047Gh2.LINKEDIN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[EnumC3047Gh2.UNSUPPORTED_SITE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public final String a(String str) {
        EnumC3047Gh2 a2 = CS2.a(str);
        String str2 = C8101ml.a;
        String a3 = C4543Vp1.a();
        switch (a.a[a2.ordinal()]) {
            case 1:
                str2 = C8101ml.a;
                break;
            case 2:
                str2 = C8101ml.b;
                break;
            case 3:
                str2 = C8101ml.c;
                break;
            case 4:
                str2 = C8101ml.h;
                break;
            case 5:
                str2 = C8101ml.g;
                break;
            case 6:
                str2 = C8101ml.f;
                break;
            case 7:
                str2 = C8101ml.i;
                break;
            case 8:
                str2 = C8101ml.e;
                break;
            case 9:
                str2 = C8101ml.d;
                break;
            case 10:
                str2 = "UNSUPPORTED_SITE";
                break;
        }
        return a3 + RemoteSettings.i + str2;
    }

    public String b(String str) {
        return a(str);
    }
}

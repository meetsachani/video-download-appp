package o;

import android.media.MediaFormat;
import android.os.Build;
import android.util.Size;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: o.Ne1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3719Ne1 implements InterfaceC10688xL1 {
    public static final List<String> a = Arrays.asList("lg-k430", "redmi note 4", "m2003j15sc", "rmx3231", "v2117", "sm-a032f", "moto g(20)", "sm-a035m");

    /* renamed from: o.Ne1$a */
    /* loaded from: classes.dex */
    public static class a {
        public final MediaFormat a;

        public a(MediaFormat mediaFormat) {
            this.a = mediaFormat;
        }

        public final String a() {
            return this.a.getString("mime");
        }

        public boolean b() {
            return "video/avc".equalsIgnoreCase(a());
        }

        public boolean c() {
            return C4128Rj1.p.equalsIgnoreCase(a());
        }

        public boolean d(int i, int i2) {
            int integer = this.a.getInteger("width");
            int integer2 = this.a.getInteger("height");
            if (integer == i && integer2 == i2) {
                return true;
            }
            return false;
        }

        public boolean e() {
            String a = a();
            if (a != null && a.contains("video/")) {
                return true;
            }
            return false;
        }
    }

    public static Set<Size> d() {
        if (e()) {
            return Collections.singleton(new Size(1920, FC.u));
        }
        return Collections.EMPTY_SET;
    }

    public static boolean e() {
        return a.contains(Build.MODEL.toLowerCase(Locale.US));
    }

    private static boolean f() {
        if ("Huawei".equalsIgnoreCase(Build.BRAND) && "mha-l29".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    public static boolean g() {
        if ("motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    public static boolean h() {
        if ("Nokia".equalsIgnoreCase(Build.BRAND) && "Nokia 1".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    private static boolean i() {
        if ("positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    public static boolean j() {
        if ("Redmi".equalsIgnoreCase(Build.BRAND) && "Redmi Note 8 Pro".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    public static boolean l() {
        if ("LGE".equalsIgnoreCase(Build.BRAND) && "LG-X230".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    public static boolean m() {
        if ("infinix".equalsIgnoreCase(Build.BRAND) && "infinix x650".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    public static boolean n() {
        if (!h() && !g() && !m() && !l() && !f() && !j() && !i() && !e()) {
            return false;
        }
        return true;
    }

    public boolean k(MediaFormat mediaFormat) {
        a aVar = new a(mediaFormat);
        if (!h() && !g() && !m() && !l() && !i()) {
            if (!f() && !j()) {
                if (e() && aVar.b() && aVar.d(1920, FC.u)) {
                    return true;
                }
                return false;
            } else if (aVar.e() && aVar.d(3840, 2160)) {
                return true;
            } else {
                return false;
            }
        }
        return aVar.c();
    }
}

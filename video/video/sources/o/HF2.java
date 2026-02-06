package o;

import java.io.File;

/* loaded from: classes3.dex */
public final class HF2 {
    public String a;
    public File b;
    public String c;
    public String d;

    public HF2(String str, String str2, String str3, File file) {
        C6562gT0.p(str, "name");
        C6562gT0.p(str2, "size");
        C6562gT0.p(str3, "duration");
        C6562gT0.p(file, "file");
        this.c = str;
        this.d = str2;
        this.a = str3;
        this.b = file;
    }

    public static HF2 f(HF2 hf2, String str, String str2, String str3, File file, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hf2.c;
        }
        if ((i & 2) != 0) {
            str2 = hf2.d;
        }
        if ((i & 4) != 0) {
            str3 = hf2.a;
        }
        if ((i & 8) != 0) {
            file = hf2.b;
        }
        return hf2.e(str, str2, str3, file);
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.a;
    }

    public final File d() {
        return this.b;
    }

    public final HF2 e(String str, String str2, String str3, File file) {
        C6562gT0.p(str, "name");
        C6562gT0.p(str2, "size");
        C6562gT0.p(str3, "duration");
        C6562gT0.p(file, "file");
        return new HF2(str, str2, str3, file);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HF2) {
            HF2 hf2 = (HF2) obj;
            if (C6562gT0.g(this.c, hf2.c) && C6562gT0.g(this.d, hf2.d) && C6562gT0.g(this.a, hf2.a) && C6562gT0.g(this.b, hf2.b)) {
                return true;
            }
        }
        return false;
    }

    public final String g() {
        return this.a;
    }

    public final File h() {
        return this.b;
    }

    public int hashCode() {
        return (((((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + this.a.hashCode()) * 31) + this.b.hashCode();
    }

    public final String i() {
        return this.c;
    }

    public final String j() {
        return this.d;
    }

    public final void k(String str) {
        C6562gT0.p(str, "<set-?>");
        this.a = str;
    }

    public final void l(File file) {
        C6562gT0.p(file, "<set-?>");
        this.b = file;
    }

    public final void m(String str) {
        C6562gT0.p(str, "<set-?>");
        this.c = str;
    }

    public final void n(String str) {
        C6562gT0.p(str, "<set-?>");
        this.d = str;
    }

    public String toString() {
        return "VideoDownloads(name=" + this.c + ", size=" + this.d + ", duration=" + this.a + ", file=" + this.b + ')';
    }
}

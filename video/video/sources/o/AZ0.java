package o;

import java.util.Arrays;

@Deprecated
/* loaded from: classes2.dex */
public abstract class AZ0 {
    public static final String d = "LibraryLoader";
    public String[] a;
    public boolean b;
    public boolean c;

    public AZ0(String... strArr) {
        this.a = strArr;
    }

    public synchronized boolean a() {
        if (this.b) {
            return this.c;
        }
        this.b = true;
        try {
            for (String str : this.a) {
                b(str);
            }
            this.c = true;
        } catch (UnsatisfiedLinkError unused) {
            I31.n(d, "Failed to load " + Arrays.toString(this.a));
        }
        return this.c;
    }

    public abstract void b(String str);

    public synchronized void c(String... strArr) {
        C9542sf.j(!this.b, "Cannot set libraries after loading");
        this.a = strArr;
    }
}

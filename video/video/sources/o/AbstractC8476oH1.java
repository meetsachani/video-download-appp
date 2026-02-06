package o;

import org.jetbrains.annotations.NotNull;

/* renamed from: o.oH1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8476oH1<T> {
    public final int a;
    public int b;
    @NotNull
    public final T[] c;

    public AbstractC8476oH1(int i) {
        this.a = i;
        this.c = (T[]) new Object[i];
    }

    public final void a(@NotNull T t) {
        C6562gT0.p(t, "spreadArgument");
        T[] tArr = this.c;
        int i = this.b;
        this.b = i + 1;
        tArr[i] = t;
    }

    public final int b() {
        return this.b;
    }

    public abstract int c(@NotNull T t);

    public final void e(int i) {
        this.b = i;
    }

    public final int f() {
        int i;
        int i2 = this.a - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int i4 = 0;
            while (true) {
                T t = this.c[i4];
                if (t != null) {
                    i = c(t);
                } else {
                    i = 1;
                }
                i3 += i;
                if (i4 == i2) {
                    break;
                }
                i4++;
            }
        }
        return i3;
    }

    @NotNull
    public final T g(@NotNull T t, @NotNull T t2) {
        int i;
        C6562gT0.p(t, androidx.lifecycle.p.g);
        C6562gT0.p(t2, "result");
        int i2 = this.a - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int i4 = 0;
            int i5 = 0;
            i = 0;
            while (true) {
                T t3 = this.c[i4];
                if (t3 != null) {
                    if (i5 < i4) {
                        int i6 = i4 - i5;
                        System.arraycopy(t, i5, t2, i, i6);
                        i += i6;
                    }
                    int c = c(t3);
                    System.arraycopy(t3, 0, t2, i, c);
                    i += c;
                    i5 = i4 + 1;
                }
                if (i4 == i2) {
                    break;
                }
                i4++;
            }
            i3 = i5;
        } else {
            i = 0;
        }
        int i7 = this.a;
        if (i3 < i7) {
            System.arraycopy(t, i3, t2, i, i7 - i3);
        }
        return t2;
    }

    public static /* synthetic */ void d() {
    }
}

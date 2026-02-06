package o;

/* loaded from: classes4.dex */
public class G90<R> {
    public final F90<R> a;
    public final CharSequence b;

    public G90(F90<R> f90, CharSequence charSequence) {
        boolean z;
        if (f90 != null) {
            z = true;
        } else {
            z = false;
        }
        C11147zE2.B(z, "The edit distance may not be null.", new Object[0]);
        this.a = f90;
        this.b = charSequence;
    }

    public R a(CharSequence charSequence) {
        return this.a.a(this.b, charSequence);
    }

    public F90<R> b() {
        return this.a;
    }

    public CharSequence c() {
        return this.b;
    }
}

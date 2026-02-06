package o;

/* renamed from: o.r62  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9168r62<R> {
    public final InterfaceC8919q62<R> a;
    public final CharSequence b;

    public C9168r62(InterfaceC8919q62<R> interfaceC8919q62, CharSequence charSequence) {
        boolean z;
        if (interfaceC8919q62 != null) {
            z = true;
        } else {
            z = false;
        }
        C11147zE2.B(z, "The edit distance may not be null.", new Object[0]);
        this.a = interfaceC8919q62;
        this.b = charSequence;
    }

    public R a(CharSequence charSequence) {
        return this.a.a(this.b, charSequence);
    }

    public CharSequence b() {
        return this.b;
    }

    public InterfaceC8919q62<R> c() {
        return this.a;
    }
}

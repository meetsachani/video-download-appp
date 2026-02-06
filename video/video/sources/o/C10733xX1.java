package o;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import o.C6126ek0;
import o.FE1;

/* renamed from: o.xX1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10733xX1 {
    public final X61<InterfaceC6575gX0, String> a = new X61<>(1000);
    public final FE1.a<b> b = C6126ek0.e(10, new a());

    /* renamed from: o.xX1$a */
    /* loaded from: classes.dex */
    public class a implements C6126ek0.d<b> {
        public a() {
        }

        @Override // o.C6126ek0.d
        /* renamed from: b */
        public b a() {
            try {
                return new b(MessageDigest.getInstance(com.facebook.internal.l0.e));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: o.xX1$b */
    /* loaded from: classes.dex */
    public static final class b implements C6126ek0.f {
        public final MessageDigest X;
        public final AbstractC2428Ac2 Y = AbstractC2428Ac2.a();

        public b(MessageDigest messageDigest) {
            this.X = messageDigest;
        }

        @Override // o.C6126ek0.f
        public AbstractC2428Ac2 e() {
            return this.Y;
        }
    }

    public final String a(InterfaceC6575gX0 interfaceC6575gX0) {
        b bVar = (b) C10175vF1.e(this.b.a());
        try {
            interfaceC6575gX0.b(bVar.X);
            return SD2.B(bVar.X.digest());
        } finally {
            this.b.b(bVar);
        }
    }

    public String b(InterfaceC6575gX0 interfaceC6575gX0) {
        String k;
        synchronized (this.a) {
            k = this.a.k(interfaceC6575gX0);
        }
        if (k == null) {
            k = a(interfaceC6575gX0);
        }
        synchronized (this.a) {
            this.a.o(interfaceC6575gX0, k);
        }
        return k;
    }
}

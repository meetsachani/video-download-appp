package o;

import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.C2416z;
import com.facebook.internal.C2356a;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.v32  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10128v32 {
    @NotNull
    public static final C10128v32 a = new C10128v32();
    @NotNull
    public static final c b = new d();
    @NotNull
    public static final c c = new c();
    @NotNull
    public static final c d = new a();
    @NotNull
    public static final c e = new b();

    /* renamed from: o.v32$a */
    /* loaded from: classes2.dex */
    public static final class a extends c {
        @Override // o.C10128v32.c
        public void b(@NotNull E32 e32) {
            C6562gT0.p(e32, "linkContent");
            com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
            if (com.facebook.internal.l0.f0(e32.h())) {
                return;
            }
            throw new C2416z("Cannot share link content with quote using the share api");
        }

        @Override // o.C10128v32.c
        public void d(@NotNull G32 g32) {
            C6562gT0.p(g32, "mediaContent");
            throw new C2416z("Cannot share ShareMediaContent using the share api");
        }

        @Override // o.C10128v32.c
        public void e(@NotNull L32 l32) {
            C6562gT0.p(l32, C2356a.i0);
            C10128v32.a.w(l32, this);
        }

        @Override // o.C10128v32.c
        public void i(@NotNull S32 s32) {
            C6562gT0.p(s32, "videoContent");
            com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
            if (com.facebook.internal.l0.f0(s32.d())) {
                if (com.facebook.internal.l0.g0(s32.c())) {
                    if (com.facebook.internal.l0.f0(s32.e())) {
                        return;
                    }
                    throw new C2416z("Cannot share video content with referrer URL using the share api");
                }
                throw new C2416z("Cannot share video content with people IDs using the share api");
            }
            throw new C2416z("Cannot share video content with place IDs using the share api");
        }
    }

    /* renamed from: o.v32$b */
    /* loaded from: classes2.dex */
    public static final class b extends c {
        @Override // o.C10128v32.c
        public void g(@Nullable O32 o32) {
            C10128v32.a.B(o32, this);
        }
    }

    /* renamed from: o.v32$c */
    /* loaded from: classes2.dex */
    public static class c {
        public void a(@NotNull C9156r32 c9156r32) {
            C6562gT0.p(c9156r32, "cameraEffectContent");
            C10128v32.a.l(c9156r32);
        }

        public void b(@NotNull E32 e32) {
            C6562gT0.p(e32, "linkContent");
            C10128v32.a.r(e32, this);
        }

        public void c(@NotNull F32<?, ?> f32) {
            C6562gT0.p(f32, "medium");
            C10128v32 c10128v32 = C10128v32.a;
            C10128v32.t(f32, this);
        }

        public void d(@NotNull G32 g32) {
            C6562gT0.p(g32, "mediaContent");
            C10128v32.a.s(g32, this);
        }

        public void e(@NotNull L32 l32) {
            C6562gT0.p(l32, C2356a.i0);
            C10128v32.a.x(l32, this);
        }

        public void f(@NotNull M32 m32) {
            C6562gT0.p(m32, "photoContent");
            C10128v32.a.v(m32, this);
        }

        public void g(@Nullable O32 o32) {
            C10128v32.a.B(o32, this);
        }

        public void h(@Nullable R32 r32) {
            C10128v32.a.C(r32, this);
        }

        public void i(@NotNull S32 s32) {
            C6562gT0.p(s32, "videoContent");
            C10128v32.a.D(s32, this);
        }
    }

    /* renamed from: o.v32$d */
    /* loaded from: classes2.dex */
    public static final class d extends c {
        @Override // o.C10128v32.c
        public void d(@NotNull G32 g32) {
            C6562gT0.p(g32, "mediaContent");
            throw new C2416z("Cannot share ShareMediaContent via web sharing dialogs");
        }

        @Override // o.C10128v32.c
        public void e(@NotNull L32 l32) {
            C6562gT0.p(l32, C2356a.i0);
            C10128v32.a.y(l32, this);
        }

        @Override // o.C10128v32.c
        public void i(@NotNull S32 s32) {
            C6562gT0.p(s32, "videoContent");
            throw new C2416z("Cannot share ShareVideoContent via web sharing dialogs");
        }
    }

    @InterfaceC9511sW0
    public static final void m(@Nullable AbstractC9885u32<?, ?> abstractC9885u32) {
        a.k(abstractC9885u32, d);
    }

    @InterfaceC9511sW0
    public static final void n(@Nullable AbstractC9885u32<?, ?> abstractC9885u32) {
        a.k(abstractC9885u32, c);
    }

    @InterfaceC9511sW0
    public static final void o(@Nullable AbstractC9885u32<?, ?> abstractC9885u32) {
        a.k(abstractC9885u32, c);
    }

    @InterfaceC9511sW0
    public static final void p(@Nullable AbstractC9885u32<?, ?> abstractC9885u32) {
        a.k(abstractC9885u32, e);
    }

    @InterfaceC9511sW0
    public static final void q(@Nullable AbstractC9885u32<?, ?> abstractC9885u32) {
        a.k(abstractC9885u32, b);
    }

    @InterfaceC9511sW0
    public static final void t(@NotNull F32<?, ?> f32, @NotNull c cVar) {
        C6562gT0.p(f32, "medium");
        C6562gT0.p(cVar, "validator");
        if (f32 instanceof L32) {
            cVar.e((L32) f32);
        } else if (f32 instanceof R32) {
            cVar.h((R32) f32);
        } else {
            C8319ne2 c8319ne2 = C8319ne2.a;
            String format = String.format(Locale.ROOT, "Invalid media type: %s", Arrays.copyOf(new Object[]{f32.getClass().getSimpleName()}, 1));
            C6562gT0.o(format, "java.lang.String.format(locale, format, *args)");
            throw new C2416z(format);
        }
    }

    public final void A(I32 i32) {
        if (i32.e() != null) {
            return;
        }
        throw new C2416z("Must specify url for ShareMessengerURLActionButton");
    }

    public final void B(O32 o32, c cVar) {
        if (o32 != null && (o32.k() != null || o32.n() != null)) {
            if (o32.k() != null) {
                cVar.c(o32.k());
            }
            if (o32.n() != null) {
                cVar.e(o32.n());
                return;
            }
            return;
        }
        throw new C2416z("Must pass the Facebook app a background asset, a sticker asset, or both");
    }

    public final void C(R32 r32, c cVar) {
        if (r32 != null) {
            Uri d2 = r32.d();
            if (d2 != null) {
                com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                if (!com.facebook.internal.l0.a0(d2) && !com.facebook.internal.l0.d0(d2)) {
                    throw new C2416z("ShareVideo must reference a video that is on the device");
                }
                return;
            }
            throw new C2416z("ShareVideo does not have a LocalUrl specified");
        }
        throw new C2416z("Cannot share a null ShareVideo");
    }

    public final void D(S32 s32, c cVar) {
        cVar.h(s32.n());
        L32 m = s32.m();
        if (m != null) {
            cVar.e(m);
        }
    }

    public final void k(AbstractC9885u32<?, ?> abstractC9885u32, c cVar) throws C2416z {
        if (abstractC9885u32 != null) {
            if (abstractC9885u32 instanceof E32) {
                cVar.b((E32) abstractC9885u32);
                return;
            } else if (abstractC9885u32 instanceof M32) {
                cVar.f((M32) abstractC9885u32);
                return;
            } else if (abstractC9885u32 instanceof S32) {
                cVar.i((S32) abstractC9885u32);
                return;
            } else if (abstractC9885u32 instanceof G32) {
                cVar.d((G32) abstractC9885u32);
                return;
            } else if (abstractC9885u32 instanceof C9156r32) {
                cVar.a((C9156r32) abstractC9885u32);
                return;
            } else if (abstractC9885u32 instanceof O32) {
                cVar.g((O32) abstractC9885u32);
                return;
            } else {
                return;
            }
        }
        throw new C2416z("Must provide non-null content to share");
    }

    public final void l(C9156r32 c9156r32) {
        String k = c9156r32.k();
        com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
        if (!com.facebook.internal.l0.f0(k)) {
            return;
        }
        throw new C2416z("Must specify a non-empty effectId");
    }

    public final void r(E32 e32, c cVar) {
        Uri a2 = e32.a();
        if (a2 != null) {
            com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
            if (!com.facebook.internal.l0.h0(a2)) {
                throw new C2416z("Content Url must be an http:// or https:// url");
            }
        }
    }

    public final void s(G32 g32, c cVar) {
        List<F32<?, ?>> h = g32.h();
        if (h != null && !h.isEmpty()) {
            if (h.size() <= 6) {
                for (F32<?, ?> f32 : h) {
                    cVar.c(f32);
                }
                return;
            }
            C8319ne2 c8319ne2 = C8319ne2.a;
            String format = String.format(Locale.ROOT, "Cannot add more than %d media.", Arrays.copyOf(new Object[]{6}, 1));
            C6562gT0.o(format, "java.lang.String.format(locale, format, *args)");
            throw new C2416z(format);
        }
        throw new C2416z("Must specify at least one medium in ShareMediaContent.");
    }

    public final void u(L32 l32) {
        if (l32 != null) {
            Bitmap d2 = l32.d();
            Uri f = l32.f();
            if (d2 == null && f == null) {
                throw new C2416z("SharePhoto does not have a Bitmap or ImageUrl specified");
            }
            return;
        }
        throw new C2416z("Cannot share a null SharePhoto");
    }

    public final void v(M32 m32, c cVar) {
        List<L32> h = m32.h();
        if (h != null && !h.isEmpty()) {
            if (h.size() <= 6) {
                for (L32 l32 : h) {
                    cVar.e(l32);
                }
                return;
            }
            C8319ne2 c8319ne2 = C8319ne2.a;
            String format = String.format(Locale.ROOT, "Cannot add more than %d photos.", Arrays.copyOf(new Object[]{6}, 1));
            C6562gT0.o(format, "java.lang.String.format(locale, format, *args)");
            throw new C2416z(format);
        }
        throw new C2416z("Must specify at least one Photo in SharePhotoContent.");
    }

    public final void w(L32 l32, c cVar) {
        u(l32);
        Bitmap d2 = l32.d();
        Uri f = l32.f();
        if (d2 == null) {
            com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
            if (com.facebook.internal.l0.h0(f)) {
                throw new C2416z("Cannot set the ImageUrl of a SharePhoto to the Uri of an image on the web when sharing SharePhotoContent");
            }
        }
    }

    public final void x(L32 l32, c cVar) {
        w(l32, cVar);
        if (l32.d() == null) {
            com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
            if (com.facebook.internal.l0.h0(l32.f())) {
                return;
            }
        }
        com.facebook.internal.m0 m0Var = com.facebook.internal.m0.a;
        com.facebook.M m = com.facebook.M.a;
        com.facebook.internal.m0.g(com.facebook.M.n());
    }

    public final void y(L32 l32, c cVar) {
        u(l32);
    }

    public final void z(H32 h32) {
        if (h32 != null) {
            com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
            if (!com.facebook.internal.l0.f0(h32.a())) {
                if (h32 instanceof I32) {
                    A((I32) h32);
                    return;
                }
                return;
            }
            throw new C2416z("Must specify title for ShareMessengerActionButton");
        }
    }
}

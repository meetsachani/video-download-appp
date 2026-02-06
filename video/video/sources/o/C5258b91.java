package o;

import android.os.Build;
import android.view.View;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.b91  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5258b91 {
    @InterfaceC11300zs1
    public final d a;
    @InterfaceC5670cr1
    public final InterfaceC5015a91 b;
    @InterfaceC5670cr1
    public final View c;

    @ES1(33)
    /* renamed from: o.b91$b */
    /* loaded from: classes3.dex */
    public static class b implements d {
        @InterfaceC11300zs1
        public OnBackInvokedCallback a;

        public b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x0005, code lost:
            r2 = r2.findOnBackInvokedDispatcher();
         */
        @Override // o.C5258b91.d
        @K40
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void a(@InterfaceC5670cr1 View view) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher;
            if (this.a != null && findOnBackInvokedDispatcher != null) {
                findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.a);
                this.a = null;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x0005, code lost:
            r3 = r3.findOnBackInvokedDispatcher();
         */
        @Override // o.C5258b91.d
        @K40
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void b(@InterfaceC5670cr1 InterfaceC5015a91 interfaceC5015a91, @InterfaceC5670cr1 View view, boolean z) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher;
            int i;
            if (this.a != null || findOnBackInvokedDispatcher == null) {
                return;
            }
            OnBackInvokedCallback c = c(interfaceC5015a91);
            this.a = c;
            if (z) {
                i = 1000000;
            } else {
                i = 0;
            }
            findOnBackInvokedDispatcher.registerOnBackInvokedCallback(i, c);
        }

        public OnBackInvokedCallback c(@InterfaceC5670cr1 final InterfaceC5015a91 interfaceC5015a91) {
            Objects.requireNonNull(interfaceC5015a91);
            return new OnBackInvokedCallback() { // from class: o.d91
                public final void onBackInvoked() {
                    interfaceC5015a91.f();
                }
            };
        }

        public boolean d() {
            if (this.a != null) {
                return true;
            }
            return false;
        }
    }

    @ES1(34)
    /* renamed from: o.b91$c */
    /* loaded from: classes3.dex */
    public static class c extends b {

        /* renamed from: o.b91$c$a */
        /* loaded from: classes3.dex */
        public class a implements OnBackAnimationCallback {
            public final /* synthetic */ InterfaceC5015a91 a;

            public a(InterfaceC5015a91 interfaceC5015a91) {
                this.a = interfaceC5015a91;
            }

            public void onBackCancelled() {
                if (!c.this.d()) {
                    return;
                }
                this.a.b();
            }

            public void onBackInvoked() {
                this.a.f();
            }

            public void onBackProgressed(@InterfaceC5670cr1 BackEvent backEvent) {
                if (!c.this.d()) {
                    return;
                }
                this.a.e(new C8827pk(backEvent));
            }

            public void onBackStarted(@InterfaceC5670cr1 BackEvent backEvent) {
                if (!c.this.d()) {
                    return;
                }
                this.a.d(new C8827pk(backEvent));
            }
        }

        public c() {
            super();
        }

        @Override // o.C5258b91.b
        public OnBackInvokedCallback c(@InterfaceC5670cr1 InterfaceC5015a91 interfaceC5015a91) {
            return new a(interfaceC5015a91);
        }
    }

    /* renamed from: o.b91$d */
    /* loaded from: classes3.dex */
    public interface d {
        void a(@InterfaceC5670cr1 View view);

        void b(@InterfaceC5670cr1 InterfaceC5015a91 interfaceC5015a91, @InterfaceC5670cr1 View view, boolean z);
    }

    public <T extends View & InterfaceC5015a91> C5258b91(@InterfaceC5670cr1 T t) {
        this(t, t);
    }

    @InterfaceC11300zs1
    public static d a() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            return new c();
        }
        if (i < 33) {
            return null;
        }
        return new b();
    }

    public boolean b() {
        if (this.a != null) {
            return true;
        }
        return false;
    }

    public void c() {
        d(false);
    }

    public final void d(boolean z) {
        d dVar = this.a;
        if (dVar != null) {
            dVar.b(this.b, this.c, z);
        }
    }

    public void e() {
        d(true);
    }

    public void f() {
        d dVar = this.a;
        if (dVar != null) {
            dVar.a(this.c);
        }
    }

    public C5258b91(@InterfaceC5670cr1 InterfaceC5015a91 interfaceC5015a91, @InterfaceC5670cr1 View view) {
        this.a = a();
        this.b = interfaceC5015a91;
        this.c = view;
    }
}

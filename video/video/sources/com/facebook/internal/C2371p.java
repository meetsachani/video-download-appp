package com.facebook.internal;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.facebook.C2416z;
import com.facebook.internal.DialogC2374t;
import com.facebook.internal.q0;
import java.util.Arrays;
import o.ActivityC4864Yy0;
import o.C6562gT0;
import o.C8319ne2;
import o.C9516sY;
import o.C9998uW1;
import o.DialogInterface$OnCancelListenerC6458g30;
import o.InterfaceC5056aJ2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.facebook.internal.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2371p extends DialogInterface$OnCancelListenerC6458g30 {
    @NotNull
    public static final a J2 = new a(null);
    @NotNull
    public static final String K2 = "FacebookDialogFragment";
    @Nullable
    public Dialog I2;

    /* renamed from: com.facebook.internal.p$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    public static final void i3(C2371p c2371p, Bundle bundle, C2416z c2416z) {
        C6562gT0.p(c2371p, "this$0");
        c2371p.k3(bundle, c2416z);
    }

    public static final void j3(C2371p c2371p, Bundle bundle, C2416z c2416z) {
        C6562gT0.p(c2371p, "this$0");
        c2371p.l3(bundle);
    }

    @Override // o.DialogInterface$OnCancelListenerC6458g30, androidx.fragment.app.Fragment
    public void N0(@Nullable Bundle bundle) {
        super.N0(bundle);
        h3();
    }

    @Override // o.DialogInterface$OnCancelListenerC6458g30
    @NotNull
    public Dialog R2(@Nullable Bundle bundle) {
        Dialog dialog = this.I2;
        if (dialog == null) {
            k3(null, null);
            Y2(false);
            Dialog R2 = super.R2(bundle);
            C6562gT0.o(R2, "super.onCreateDialog(savedInstanceState)");
            return R2;
        } else if (dialog != null) {
            return dialog;
        } else {
            throw new NullPointerException("null cannot be cast to non-null type android.app.Dialog");
        }
    }

    @Override // o.DialogInterface$OnCancelListenerC6458g30, androidx.fragment.app.Fragment
    public void U0() {
        Dialog N2 = N2();
        if (N2 != null && Z()) {
            N2.setDismissMessage(null);
        }
        super.U0();
    }

    @Nullable
    public final Dialog g3() {
        return this.I2;
    }

    @InterfaceC5056aJ2
    public final void h3() {
        ActivityC4864Yy0 o2;
        q0 a2;
        String string;
        if (this.I2 != null || (o2 = o()) == null) {
            return;
        }
        Intent intent = o2.getIntent();
        Z z = Z.a;
        C6562gT0.o(intent, C9998uW1.R);
        Bundle z2 = Z.z(intent);
        boolean z3 = false;
        if (z2 != null) {
            z3 = z2.getBoolean(Z.e1, false);
        }
        String str = null;
        Bundle bundle = null;
        if (!z3) {
            if (z2 == null) {
                string = null;
            } else {
                string = z2.getString("action");
            }
            if (z2 != null) {
                bundle = z2.getBundle("params");
            }
            l0 l0Var = l0.a;
            if (l0.f0(string)) {
                l0.m0(K2, "Cannot start a WebDialog with an empty/missing 'actionName'");
                o2.finish();
                return;
            } else if (string != null) {
                a2 = new q0.a(o2, string, bundle).h(new q0.e() { // from class: com.facebook.internal.n
                    @Override // com.facebook.internal.q0.e
                    public final void a(Bundle bundle2, C2416z c2416z) {
                        C2371p.i3(C2371p.this, bundle2, c2416z);
                    }
                }).a();
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        } else {
            if (z2 != null) {
                str = z2.getString("url");
            }
            l0 l0Var2 = l0.a;
            if (l0.f0(str)) {
                l0.m0(K2, "Cannot start a fallback WebDialog with an empty/missing 'url'");
                o2.finish();
                return;
            }
            C8319ne2 c8319ne2 = C8319ne2.a;
            com.facebook.M m = com.facebook.M.a;
            String format = String.format("fb%s://bridge/", Arrays.copyOf(new Object[]{com.facebook.M.o()}, 1));
            C6562gT0.o(format, "java.lang.String.format(format, *args)");
            DialogC2374t.a aVar = DialogC2374t.x1;
            if (str != null) {
                a2 = aVar.a(o2, str, format);
                a2.H(new q0.e() { // from class: com.facebook.internal.o
                    @Override // com.facebook.internal.q0.e
                    public final void a(Bundle bundle2, C2416z c2416z) {
                        C2371p.j3(C2371p.this, bundle2, c2416z);
                    }
                });
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        }
        this.I2 = a2;
    }

    @Override // androidx.fragment.app.Fragment
    public void i1() {
        super.i1();
        Dialog dialog = this.I2;
        if (dialog instanceof q0) {
            if (dialog != null) {
                ((q0) dialog).C();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
        }
    }

    public final void k3(Bundle bundle, C2416z c2416z) {
        int i;
        ActivityC4864Yy0 o2 = o();
        if (o2 == null) {
            return;
        }
        Z z = Z.a;
        Intent intent = o2.getIntent();
        C6562gT0.o(intent, "fragmentActivity.intent");
        Intent n = Z.n(intent, bundle, c2416z);
        if (c2416z == null) {
            i = -1;
        } else {
            i = 0;
        }
        o2.setResult(i, n);
        o2.finish();
    }

    public final void l3(Bundle bundle) {
        ActivityC4864Yy0 o2 = o();
        if (o2 == null) {
            return;
        }
        Intent intent = new Intent();
        if (bundle == null) {
            bundle = new Bundle();
        }
        intent.putExtras(bundle);
        o2.setResult(-1, intent);
        o2.finish();
    }

    public final void m3(@Nullable Dialog dialog) {
        this.I2 = dialog;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration configuration) {
        C6562gT0.p(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        if ((this.I2 instanceof q0) && D0()) {
            Dialog dialog = this.I2;
            if (dialog != null) {
                ((q0) dialog).C();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
        }
    }
}

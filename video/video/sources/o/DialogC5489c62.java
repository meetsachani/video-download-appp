package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import o.C7025iN1;

/* renamed from: o.c62  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class DialogC5489c62 extends AbstractDialogC9403s42<AbstractC5247b62> {
    public static final int l1 = C7025iN1.c.sideSheetDialogTheme;
    public static final int m1 = C7025iN1.n.Theme_Material3_Light_SideSheetDialog;

    public DialogC5489c62(@InterfaceC5670cr1 Context context) {
        this(context, 0);
    }

    @Override // o.AbstractDialogC9403s42
    public int C() {
        return 3;
    }

    @Override // o.AbstractDialogC9403s42
    public /* bridge */ /* synthetic */ boolean F() {
        return super.F();
    }

    @Override // o.AbstractDialogC9403s42
    public /* bridge */ /* synthetic */ void H(boolean z) {
        super.H(z);
    }

    @Override // o.AbstractDialogC9403s42
    public /* bridge */ /* synthetic */ void I(@KE0 int i) {
        super.I(i);
    }

    @Override // o.AbstractDialogC9403s42
    @InterfaceC5670cr1
    /* renamed from: M */
    public SideSheetBehavior<? extends View> u() {
        InterfaceC8424o42 u = super.u();
        if (u instanceof SideSheetBehavior) {
            return (SideSheetBehavior) u;
        }
        throw new IllegalStateException("The view is not associated with SideSheetBehavior");
    }

    @Override // o.AbstractDialogC9403s42, android.app.Dialog, android.content.DialogInterface
    public /* bridge */ /* synthetic */ void cancel() {
        super.cancel();
    }

    @Override // o.AbstractDialogC9403s42, android.app.Dialog, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // o.AbstractDialogC9403s42, android.app.Dialog, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // o.AbstractDialogC9403s42
    public void s(InterfaceC8424o42<AbstractC5247b62> interfaceC8424o42) {
        interfaceC8424o42.g(new a());
    }

    @Override // o.AbstractDialogC9403s42, android.app.Dialog
    public /* bridge */ /* synthetic */ void setCancelable(boolean z) {
        super.setCancelable(z);
    }

    @Override // o.AbstractDialogC9403s42, android.app.Dialog
    public /* bridge */ /* synthetic */ void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
    }

    @Override // o.AbstractDialogC9403s42, o.DialogC8552oc, o.DialogC11160zI, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(@BY0 int i) {
        super.setContentView(i);
    }

    @Override // o.AbstractDialogC9403s42
    @InterfaceC5670cr1
    public InterfaceC8424o42<AbstractC5247b62> v(@InterfaceC5670cr1 FrameLayout frameLayout) {
        return SideSheetBehavior.j0(frameLayout);
    }

    @Override // o.AbstractDialogC9403s42
    @PL0
    public int x() {
        return C7025iN1.h.m3_side_sheet;
    }

    @Override // o.AbstractDialogC9403s42
    @BY0
    public int z() {
        return C7025iN1.k.m3_side_sheet_dialog;
    }

    public DialogC5489c62(@InterfaceC5670cr1 Context context, @InterfaceC4698Xf2 int i) {
        super(context, i, l1, m1);
    }

    @Override // o.AbstractDialogC9403s42, o.DialogC8552oc, o.DialogC11160zI, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(@InterfaceC11300zs1 View view) {
        super.setContentView(view);
    }

    @Override // o.AbstractDialogC9403s42, o.DialogC8552oc, o.DialogC11160zI, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(@InterfaceC11300zs1 View view, @InterfaceC11300zs1 ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
    }

    /* renamed from: o.c62$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC5247b62 {
        public a() {
        }

        @Override // o.AbstractC5247b62, o.InterfaceC8668p42
        public void a(@InterfaceC5670cr1 View view, int i) {
            if (i == 5) {
                DialogC5489c62.this.cancel();
            }
        }

        @Override // o.AbstractC5247b62, o.InterfaceC8668p42
        public void b(@InterfaceC5670cr1 View view, float f) {
        }
    }
}

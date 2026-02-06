package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import o.DialogC8552oc;
import o.OL1;

/* loaded from: classes.dex */
public class a extends DialogC8552oc implements DialogInterface {
    public static final int c1 = 0;
    public static final int d1 = 1;
    public final AlertController b1;

    /* renamed from: androidx.appcompat.app.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0006a {
        public final AlertController.f a;
        public final int b;

        public C0006a(Context context) {
            this(context, a.t(context, 0));
        }

        public C0006a A(boolean z) {
            this.a.Q = z;
            return this;
        }

        public C0006a B(int i, int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.v = fVar.a.getResources().getTextArray(i);
            AlertController.f fVar2 = this.a;
            fVar2.x = onClickListener;
            fVar2.I = i2;
            fVar2.H = true;
            return this;
        }

        public C0006a C(Cursor cursor, int i, String str, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.K = cursor;
            fVar.x = onClickListener;
            fVar.I = i;
            fVar.L = str;
            fVar.H = true;
            return this;
        }

        public C0006a D(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.w = listAdapter;
            fVar.x = onClickListener;
            fVar.I = i;
            fVar.H = true;
            return this;
        }

        public C0006a E(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.v = charSequenceArr;
            fVar.x = onClickListener;
            fVar.I = i;
            fVar.H = true;
            return this;
        }

        public C0006a F(int i) {
            AlertController.f fVar = this.a;
            fVar.f = fVar.a.getText(i);
            return this;
        }

        public C0006a G(int i) {
            AlertController.f fVar = this.a;
            fVar.z = null;
            fVar.y = i;
            fVar.E = false;
            return this;
        }

        @Deprecated
        public C0006a H(View view, int i, int i2, int i3, int i4) {
            AlertController.f fVar = this.a;
            fVar.z = view;
            fVar.y = 0;
            fVar.E = true;
            fVar.A = i;
            fVar.B = i2;
            fVar.C = i3;
            fVar.D = i4;
            return this;
        }

        public a I() {
            a create = create();
            create.show();
            return create;
        }

        public C0006a a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.w = listAdapter;
            fVar.x = onClickListener;
            return this;
        }

        public C0006a b(boolean z) {
            this.a.r = z;
            return this;
        }

        public C0006a c(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            AlertController.f fVar = this.a;
            fVar.K = cursor;
            fVar.L = str;
            fVar.x = onClickListener;
            return this;
        }

        public a create() {
            a aVar = new a(this.a.a, this.b);
            this.a.a(aVar.b1);
            aVar.setCancelable(this.a.r);
            if (this.a.r) {
                aVar.setCanceledOnTouchOutside(true);
            }
            aVar.setOnCancelListener(this.a.s);
            aVar.setOnDismissListener(this.a.t);
            DialogInterface.OnKeyListener onKeyListener = this.a.u;
            if (onKeyListener != null) {
                aVar.setOnKeyListener(onKeyListener);
            }
            return aVar;
        }

        public C0006a d(View view) {
            this.a.g = view;
            return this;
        }

        public C0006a e(int i) {
            this.a.c = i;
            return this;
        }

        public C0006a f(Drawable drawable) {
            this.a.d = drawable;
            return this;
        }

        public C0006a g(int i) {
            TypedValue typedValue = new TypedValue();
            this.a.a.getTheme().resolveAttribute(i, typedValue, true);
            this.a.c = typedValue.resourceId;
            return this;
        }

        public Context getContext() {
            return this.a.a;
        }

        @Deprecated
        public C0006a h(boolean z) {
            this.a.N = z;
            return this;
        }

        public C0006a i(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.v = fVar.a.getResources().getTextArray(i);
            this.a.x = onClickListener;
            return this;
        }

        public C0006a j(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.v = charSequenceArr;
            fVar.x = onClickListener;
            return this;
        }

        public C0006a k(int i) {
            AlertController.f fVar = this.a;
            fVar.h = fVar.a.getText(i);
            return this;
        }

        public C0006a l(CharSequence charSequence) {
            this.a.h = charSequence;
            return this;
        }

        public C0006a m(int i, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.f fVar = this.a;
            fVar.v = fVar.a.getResources().getTextArray(i);
            AlertController.f fVar2 = this.a;
            fVar2.J = onMultiChoiceClickListener;
            fVar2.F = zArr;
            fVar2.G = true;
            return this;
        }

        public C0006a n(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.f fVar = this.a;
            fVar.K = cursor;
            fVar.J = onMultiChoiceClickListener;
            fVar.M = str;
            fVar.L = str2;
            fVar.G = true;
            return this;
        }

        public C0006a o(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.f fVar = this.a;
            fVar.v = charSequenceArr;
            fVar.J = onMultiChoiceClickListener;
            fVar.F = zArr;
            fVar.G = true;
            return this;
        }

        public C0006a p(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.l = charSequence;
            fVar.n = onClickListener;
            return this;
        }

        public C0006a q(Drawable drawable) {
            this.a.m = drawable;
            return this;
        }

        public C0006a r(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.f7o = fVar.a.getText(i);
            this.a.q = onClickListener;
            return this;
        }

        public C0006a s(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.f7o = charSequence;
            fVar.q = onClickListener;
            return this;
        }

        public C0006a setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.l = fVar.a.getText(i);
            this.a.n = onClickListener;
            return this;
        }

        public C0006a setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.i = fVar.a.getText(i);
            this.a.k = onClickListener;
            return this;
        }

        public C0006a setTitle(CharSequence charSequence) {
            this.a.f = charSequence;
            return this;
        }

        public C0006a setView(View view) {
            AlertController.f fVar = this.a;
            fVar.z = view;
            fVar.y = 0;
            fVar.E = false;
            return this;
        }

        public C0006a t(Drawable drawable) {
            this.a.p = drawable;
            return this;
        }

        public C0006a u(DialogInterface.OnCancelListener onCancelListener) {
            this.a.s = onCancelListener;
            return this;
        }

        public C0006a v(DialogInterface.OnDismissListener onDismissListener) {
            this.a.t = onDismissListener;
            return this;
        }

        public C0006a w(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.a.O = onItemSelectedListener;
            return this;
        }

        public C0006a x(DialogInterface.OnKeyListener onKeyListener) {
            this.a.u = onKeyListener;
            return this;
        }

        public C0006a y(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.i = charSequence;
            fVar.k = onClickListener;
            return this;
        }

        public C0006a z(Drawable drawable) {
            this.a.j = drawable;
            return this;
        }

        public C0006a(Context context, int i) {
            this.a = new AlertController.f(new ContextThemeWrapper(context, a.t(context, i)));
            this.b = i;
        }
    }

    public a(Context context) {
        this(context, 0);
    }

    public static int t(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(OL1.b.N, typedValue, true);
        return typedValue.resourceId;
    }

    public void A(int i) {
        this.b1.o(i);
    }

    public void C(Drawable drawable) {
        this.b1.p(drawable);
    }

    public void D(int i) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(i, typedValue, true);
        this.b1.o(typedValue.resourceId);
    }

    public void F(CharSequence charSequence) {
        this.b1.q(charSequence);
    }

    public void G(View view) {
        this.b1.u(view);
    }

    public void H(View view, int i, int i2, int i3, int i4) {
        this.b1.v(view, i, i2, i3, i4);
    }

    @Override // o.DialogC8552oc, o.DialogC11160zI, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.b1.f();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.b1.h(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.b1.i(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public Button r(int i) {
        return this.b1.c(i);
    }

    public ListView s() {
        return this.b1.e();
    }

    @Override // o.DialogC8552oc, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.b1.s(charSequence);
    }

    public void u(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.b1.l(i, charSequence, onClickListener, null, null);
    }

    public void v(int i, CharSequence charSequence, Drawable drawable, DialogInterface.OnClickListener onClickListener) {
        this.b1.l(i, charSequence, onClickListener, null, drawable);
    }

    public void w(int i, CharSequence charSequence, Message message) {
        this.b1.l(i, charSequence, null, message, null);
    }

    public void x(int i) {
        this.b1.m(i);
    }

    public void z(View view) {
        this.b1.n(view);
    }

    public a(Context context, int i) {
        super(context, t(context, i));
        this.b1 = new AlertController(getContext(), this, getWindow());
    }

    public a(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        this(context, 0);
        setCancelable(z);
        setOnCancelListener(onCancelListener);
    }
}

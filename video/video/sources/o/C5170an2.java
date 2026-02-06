package o;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

/* renamed from: o.an2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5170an2 {

    /* renamed from: o.an2$d */
    /* loaded from: classes.dex */
    public static final class d implements TextWatcher {
        public final /* synthetic */ HA0<Editable, C7458kA2> X;
        public final /* synthetic */ ZA0<CharSequence, Integer, Integer, Integer, C7458kA2> Y;
        public final /* synthetic */ ZA0<CharSequence, Integer, Integer, Integer, C7458kA2> Z;

        /* JADX WARN: Multi-variable type inference failed */
        public d(HA0<? super Editable, C7458kA2> ha0, ZA0<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, C7458kA2> za0, ZA0<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, C7458kA2> za02) {
            this.X = ha0;
            this.Y = za0;
            this.Z = za02;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            this.X.invoke(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.Y.r(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.Z.r(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    public static final TextWatcher a(TextView textView, ZA0<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, C7458kA2> za0, ZA0<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, C7458kA2> za02, HA0<? super Editable, C7458kA2> ha0) {
        d dVar = new d(ha0, za0, za02);
        textView.addTextChangedListener(dVar);
        return dVar;
    }

    public static /* synthetic */ TextWatcher b(TextView textView, ZA0 za0, ZA0 za02, HA0 ha0, int i, Object obj) {
        if ((i & 1) != 0) {
            za0 = a.X;
        }
        if ((i & 2) != 0) {
            za02 = b.X;
        }
        if ((i & 4) != 0) {
            ha0 = c.X;
        }
        d dVar = new d(ha0, za0, za02);
        textView.addTextChangedListener(dVar);
        return dVar;
    }

    public static final TextWatcher c(TextView textView, HA0<? super Editable, C7458kA2> ha0) {
        e eVar = new e(ha0);
        textView.addTextChangedListener(eVar);
        return eVar;
    }

    public static final TextWatcher d(TextView textView, ZA0<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, C7458kA2> za0) {
        f fVar = new f(za0);
        textView.addTextChangedListener(fVar);
        return fVar;
    }

    public static final TextWatcher e(TextView textView, ZA0<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, C7458kA2> za0) {
        g gVar = new g(za0);
        textView.addTextChangedListener(gVar);
        return gVar;
    }

    /* renamed from: o.an2$c */
    /* loaded from: classes.dex */
    public static final class c extends AbstractC8052mY0 implements HA0<Editable, C7458kA2> {
        public static final c X = new c();

        public c() {
            super(1);
        }

        @Override // o.HA0
        public /* bridge */ /* synthetic */ C7458kA2 invoke(Editable editable) {
            c(editable);
            return C7458kA2.a;
        }

        public final void c(Editable editable) {
        }
    }

    /* renamed from: o.an2$f */
    /* loaded from: classes.dex */
    public static final class f implements TextWatcher {
        public final /* synthetic */ ZA0 X;

        public f(ZA0 za0) {
            this.X = za0;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.X.r(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: o.an2$g */
    /* loaded from: classes.dex */
    public static final class g implements TextWatcher {
        public final /* synthetic */ ZA0 X;

        public g(ZA0 za0) {
            this.X = za0;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.X.r(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: o.an2$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC8052mY0 implements ZA0<CharSequence, Integer, Integer, Integer, C7458kA2> {
        public static final a X = new a();

        public a() {
            super(4);
        }

        @Override // o.ZA0
        public /* bridge */ /* synthetic */ C7458kA2 r(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
            c(charSequence, num.intValue(), num2.intValue(), num3.intValue());
            return C7458kA2.a;
        }

        public final void c(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: o.an2$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC8052mY0 implements ZA0<CharSequence, Integer, Integer, Integer, C7458kA2> {
        public static final b X = new b();

        public b() {
            super(4);
        }

        @Override // o.ZA0
        public /* bridge */ /* synthetic */ C7458kA2 r(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
            c(charSequence, num.intValue(), num2.intValue(), num3.intValue());
            return C7458kA2.a;
        }

        public final void c(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: o.an2$e */
    /* loaded from: classes.dex */
    public static final class e implements TextWatcher {
        public final /* synthetic */ HA0 X;

        public e(HA0 ha0) {
            this.X = ha0;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            this.X.invoke(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}

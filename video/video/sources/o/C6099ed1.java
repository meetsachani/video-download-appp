package o;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.ed1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6099ed1<S> extends VC1<S> {
    public static final String l2 = "THEME_RES_ID_KEY";
    public static final String m2 = "DATE_SELECTOR_KEY";
    public static final String n2 = "CALENDAR_CONSTRAINTS_KEY";
    @InterfaceC4698Xf2
    public int i2;
    @InterfaceC11300zs1
    public InterfaceC9015qV<S> j2;
    @InterfaceC11300zs1
    public com.google.android.material.datepicker.a k2;

    /* renamed from: o.ed1$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC6912hv1<S> {
        public a() {
        }

        @Override // o.AbstractC6912hv1
        public void a() {
            Iterator<AbstractC6912hv1<S>> it = C6099ed1.this.h2.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }

        @Override // o.AbstractC6912hv1
        public void b(S s) {
            Iterator<AbstractC6912hv1<S>> it = C6099ed1.this.h2.iterator();
            while (it.hasNext()) {
                it.next().b(s);
            }
        }
    }

    @InterfaceC5670cr1
    public static <T> C6099ed1<T> K2(InterfaceC9015qV<T> interfaceC9015qV, @InterfaceC4698Xf2 int i, @InterfaceC5670cr1 com.google.android.material.datepicker.a aVar) {
        C6099ed1<T> c6099ed1 = new C6099ed1<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("DATE_SELECTOR_KEY", interfaceC9015qV);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        c6099ed1.f2(bundle);
        return c6099ed1;
    }

    @Override // o.VC1
    @InterfaceC5670cr1
    public InterfaceC9015qV<S> I2() {
        InterfaceC9015qV<S> interfaceC9015qV = this.j2;
        if (interfaceC9015qV != null) {
            return interfaceC9015qV;
        }
        throw new IllegalStateException("dateSelector should not be null. Use MaterialTextInputPicker#newInstance() to create this fragment with a DateSelector, and call this method after the fragment has been created.");
    }

    @Override // androidx.fragment.app.Fragment
    public void N0(@InterfaceC11300zs1 Bundle bundle) {
        super.N0(bundle);
        if (bundle == null) {
            bundle = s();
        }
        this.i2 = bundle.getInt("THEME_RES_ID_KEY");
        this.j2 = (InterfaceC9015qV) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.k2 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC5670cr1
    public View R0(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, @InterfaceC11300zs1 Bundle bundle) {
        return this.j2.l(layoutInflater.cloneInContext(new ContextThemeWrapper(v(), this.i2)), viewGroup, bundle, this.k2, new a());
    }

    @Override // androidx.fragment.app.Fragment
    public void j1(@InterfaceC5670cr1 Bundle bundle) {
        super.j1(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.i2);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.j2);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.k2);
    }
}

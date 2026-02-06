package o;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import o.C7025iN1;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.m82  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7954m82 implements InterfaceC9015qV<Long> {
    public static final Parcelable.Creator<C7954m82> CREATOR = new b();
    @InterfaceC11300zs1
    public CharSequence X;
    @InterfaceC11300zs1
    public Long Y;
    @InterfaceC11300zs1
    public SimpleDateFormat Z;

    /* renamed from: o.m82$a */
    /* loaded from: classes3.dex */
    public class a extends com.google.android.material.datepicker.c {
        public final /* synthetic */ AbstractC6912hv1 d1;
        public final /* synthetic */ TextInputLayout e1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, com.google.android.material.datepicker.a aVar, AbstractC6912hv1 abstractC6912hv1, TextInputLayout textInputLayout2) {
            super(str, dateFormat, textInputLayout, aVar);
            this.d1 = abstractC6912hv1;
            this.e1 = textInputLayout2;
        }

        @Override // com.google.android.material.datepicker.c
        public void d() {
            C7954m82.this.X = this.e1.getError();
            this.d1.a();
        }

        @Override // com.google.android.material.datepicker.c
        public void e(@InterfaceC11300zs1 Long l) {
            if (l == null) {
                C7954m82.this.d();
            } else {
                C7954m82.this.C0(l.longValue());
            }
            C7954m82.this.X = null;
            this.d1.b(C7954m82.this.u0());
        }
    }

    /* renamed from: o.m82$b */
    /* loaded from: classes3.dex */
    public class b implements Parcelable.Creator<C7954m82> {
        @Override // android.os.Parcelable.Creator
        @InterfaceC5670cr1
        /* renamed from: a */
        public C7954m82 createFromParcel(@InterfaceC5670cr1 Parcel parcel) {
            C7954m82 c7954m82 = new C7954m82();
            c7954m82.Y = (Long) parcel.readValue(Long.class.getClassLoader());
            return c7954m82;
        }

        @Override // android.os.Parcelable.Creator
        @InterfaceC5670cr1
        /* renamed from: b */
        public C7954m82[] newArray(int i) {
            return new C7954m82[i];
        }
    }

    @Override // o.InterfaceC9015qV
    public void C0(long j) {
        this.Y = Long.valueOf(j);
    }

    @Override // o.InterfaceC9015qV
    @InterfaceC5670cr1
    public String G(@InterfaceC5670cr1 Context context) {
        String m;
        Resources resources = context.getResources();
        Long l = this.Y;
        if (l == null) {
            m = resources.getString(C7025iN1.m.mtrl_picker_announce_current_selection_none);
        } else {
            m = C9507sV.m(l.longValue());
        }
        return resources.getString(C7025iN1.m.mtrl_picker_announce_current_selection, m);
    }

    @Override // o.InterfaceC9015qV
    public int H(Context context) {
        return X81.g(context, C7025iN1.c.materialCalendarTheme, com.google.android.material.datepicker.g.class.getCanonicalName());
    }

    @Override // o.InterfaceC9015qV
    @InterfaceC5670cr1
    public String U(@InterfaceC5670cr1 Context context) {
        Resources resources = context.getResources();
        Long l = this.Y;
        if (l == null) {
            return resources.getString(C7025iN1.m.mtrl_picker_date_header_unselected);
        }
        return resources.getString(C7025iN1.m.mtrl_picker_date_header_selected, C9507sV.m(l.longValue()));
    }

    @Override // o.InterfaceC9015qV
    @InterfaceC5670cr1
    public Collection<C4377Tx1<Long, Long>> V() {
        return new ArrayList();
    }

    public final void d() {
        this.Y = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // o.InterfaceC9015qV
    @InterfaceC11300zs1
    /* renamed from: e */
    public Long u0() {
        return this.Y;
    }

    @Override // o.InterfaceC9015qV
    /* renamed from: f */
    public void b0(@InterfaceC11300zs1 Long l) {
        Long valueOf;
        if (l == null) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(C11143zD2.a(l.longValue()));
        }
        this.Y = valueOf;
    }

    @Override // o.InterfaceC9015qV
    @InterfaceC11300zs1
    public String i() {
        if (TextUtils.isEmpty(this.X)) {
            return null;
        }
        return this.X.toString();
    }

    @Override // o.InterfaceC9015qV
    public View l(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, @InterfaceC11300zs1 Bundle bundle, com.google.android.material.datepicker.a aVar, @InterfaceC5670cr1 AbstractC6912hv1<Long> abstractC6912hv1) {
        String h;
        boolean z = false;
        View inflate = layoutInflater.inflate(C7025iN1.k.mtrl_picker_text_input_date, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(C7025iN1.h.mtrl_picker_text_input_date);
        EditText editText = textInputLayout.getEditText();
        Integer f = C9179r91.f(inflate.getContext(), C7025iN1.c.colorOnSurfaceVariant);
        if (f != null) {
            editText.setHintTextColor(f.intValue());
        }
        if (D71.b()) {
            editText.setInputType(17);
        }
        SimpleDateFormat simpleDateFormat = this.Z;
        if (simpleDateFormat != null) {
            z = true;
        }
        if (!z) {
            simpleDateFormat = C11143zD2.g();
        }
        SimpleDateFormat simpleDateFormat2 = simpleDateFormat;
        if (z) {
            h = simpleDateFormat2.toPattern();
        } else {
            h = C11143zD2.h(inflate.getResources(), simpleDateFormat2);
        }
        String str = h;
        textInputLayout.setPlaceholderText(str);
        Long l = this.Y;
        if (l != null) {
            editText.setText(simpleDateFormat2.format(l));
        }
        editText.addTextChangedListener(new a(str, simpleDateFormat2, textInputLayout, aVar, abstractC6912hv1, textInputLayout));
        if (!InterfaceC9015qV.Q(inflate.getContext())) {
            InterfaceC9015qV.j0(editText);
        }
        return inflate;
    }

    @Override // o.InterfaceC9015qV
    public void n0(@InterfaceC11300zs1 SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat != null) {
            simpleDateFormat = (SimpleDateFormat) C11143zD2.q(simpleDateFormat);
        }
        this.Z = simpleDateFormat;
    }

    @Override // o.InterfaceC9015qV
    public int p() {
        return C7025iN1.m.mtrl_picker_date_header_title;
    }

    @Override // o.InterfaceC9015qV
    public boolean p0() {
        if (this.Y != null) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC9015qV
    @InterfaceC5670cr1
    public Collection<Long> r0() {
        ArrayList arrayList = new ArrayList();
        Long l = this.Y;
        if (l != null) {
            arrayList.add(l);
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
        parcel.writeValue(this.Y);
    }
}

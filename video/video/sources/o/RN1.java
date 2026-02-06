package o;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
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
/* loaded from: classes3.dex */
public class RN1 implements InterfaceC9015qV<C4377Tx1<Long, Long>> {
    public static final Parcelable.Creator<RN1> CREATOR = new c();
    @InterfaceC11300zs1
    public CharSequence X;
    public String Y;
    @InterfaceC11300zs1
    public SimpleDateFormat c1;
    public final String Z = C4500Ve2.b;
    @InterfaceC11300zs1
    public Long Y0 = null;
    @InterfaceC11300zs1
    public Long Z0 = null;
    @InterfaceC11300zs1
    public Long a1 = null;
    @InterfaceC11300zs1
    public Long b1 = null;

    /* loaded from: classes3.dex */
    public class a extends com.google.android.material.datepicker.c {
        public final /* synthetic */ TextInputLayout d1;
        public final /* synthetic */ TextInputLayout e1;
        public final /* synthetic */ AbstractC6912hv1 f1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, com.google.android.material.datepicker.a aVar, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, AbstractC6912hv1 abstractC6912hv1) {
            super(str, dateFormat, textInputLayout, aVar);
            this.d1 = textInputLayout2;
            this.e1 = textInputLayout3;
            this.f1 = abstractC6912hv1;
        }

        @Override // com.google.android.material.datepicker.c
        public void d() {
            RN1.this.a1 = null;
            RN1.this.o(this.d1, this.e1, this.f1);
        }

        @Override // com.google.android.material.datepicker.c
        public void e(@InterfaceC11300zs1 Long l) {
            RN1.this.a1 = l;
            RN1.this.o(this.d1, this.e1, this.f1);
        }
    }

    /* loaded from: classes3.dex */
    public class b extends com.google.android.material.datepicker.c {
        public final /* synthetic */ TextInputLayout d1;
        public final /* synthetic */ TextInputLayout e1;
        public final /* synthetic */ AbstractC6912hv1 f1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, DateFormat dateFormat, TextInputLayout textInputLayout, com.google.android.material.datepicker.a aVar, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, AbstractC6912hv1 abstractC6912hv1) {
            super(str, dateFormat, textInputLayout, aVar);
            this.d1 = textInputLayout2;
            this.e1 = textInputLayout3;
            this.f1 = abstractC6912hv1;
        }

        @Override // com.google.android.material.datepicker.c
        public void d() {
            RN1.this.b1 = null;
            RN1.this.o(this.d1, this.e1, this.f1);
        }

        @Override // com.google.android.material.datepicker.c
        public void e(@InterfaceC11300zs1 Long l) {
            RN1.this.b1 = l;
            RN1.this.o(this.d1, this.e1, this.f1);
        }
    }

    /* loaded from: classes3.dex */
    public class c implements Parcelable.Creator<RN1> {
        @Override // android.os.Parcelable.Creator
        @InterfaceC5670cr1
        /* renamed from: a */
        public RN1 createFromParcel(@InterfaceC5670cr1 Parcel parcel) {
            RN1 rn1 = new RN1();
            rn1.Y0 = (Long) parcel.readValue(Long.class.getClassLoader());
            rn1.Z0 = (Long) parcel.readValue(Long.class.getClassLoader());
            return rn1;
        }

        @Override // android.os.Parcelable.Creator
        @InterfaceC5670cr1
        /* renamed from: b */
        public RN1[] newArray(int i) {
            return new RN1[i];
        }
    }

    @Override // o.InterfaceC9015qV
    public void C0(long j) {
        Long l = this.Y0;
        if (l == null) {
            this.Y0 = Long.valueOf(j);
        } else if (this.Z0 == null && h(l.longValue(), j)) {
            this.Z0 = Long.valueOf(j);
        } else {
            this.Z0 = null;
            this.Y0 = Long.valueOf(j);
        }
    }

    @Override // o.InterfaceC9015qV
    @InterfaceC5670cr1
    public String G(@InterfaceC5670cr1 Context context) {
        String str;
        String str2;
        Resources resources = context.getResources();
        C4377Tx1<String, String> a2 = C9507sV.a(this.Y0, this.Z0);
        String str3 = a2.a;
        if (str3 == null) {
            str = resources.getString(C7025iN1.m.mtrl_picker_announce_current_selection_none);
        } else {
            str = str3;
        }
        String str4 = a2.b;
        if (str4 == null) {
            str2 = resources.getString(C7025iN1.m.mtrl_picker_announce_current_selection_none);
        } else {
            str2 = str4;
        }
        return resources.getString(C7025iN1.m.mtrl_picker_announce_current_range_selection, str, str2);
    }

    @Override // o.InterfaceC9015qV
    public int H(@InterfaceC5670cr1 Context context) {
        int i;
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(C7025iN1.f.mtrl_calendar_maximum_default_fullscreen_minor_axis)) {
            i = C7025iN1.c.materialCalendarTheme;
        } else {
            i = C7025iN1.c.materialCalendarFullscreenTheme;
        }
        return X81.g(context, i, com.google.android.material.datepicker.g.class.getCanonicalName());
    }

    @Override // o.InterfaceC9015qV
    @InterfaceC5670cr1
    public String U(@InterfaceC5670cr1 Context context) {
        Resources resources = context.getResources();
        Long l = this.Y0;
        if (l == null && this.Z0 == null) {
            return resources.getString(C7025iN1.m.mtrl_picker_range_header_unselected);
        }
        Long l2 = this.Z0;
        if (l2 == null) {
            return resources.getString(C7025iN1.m.mtrl_picker_range_header_only_start_selected, C9507sV.c(l.longValue()));
        }
        if (l == null) {
            return resources.getString(C7025iN1.m.mtrl_picker_range_header_only_end_selected, C9507sV.c(l2.longValue()));
        }
        C4377Tx1<String, String> a2 = C9507sV.a(l, l2);
        return resources.getString(C7025iN1.m.mtrl_picker_range_header_selected, a2.a, a2.b);
    }

    @Override // o.InterfaceC9015qV
    @InterfaceC5670cr1
    public Collection<C4377Tx1<Long, Long>> V() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C4377Tx1(this.Y0, this.Z0));
        return arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final void f(@InterfaceC5670cr1 TextInputLayout textInputLayout, @InterfaceC5670cr1 TextInputLayout textInputLayout2) {
        if (textInputLayout.getError() != null && this.Y.contentEquals(textInputLayout.getError())) {
            textInputLayout.setError(null);
        }
        if (textInputLayout2.getError() != null && C4500Ve2.b.contentEquals(textInputLayout2.getError())) {
            textInputLayout2.setError(null);
        }
    }

    @Override // o.InterfaceC9015qV
    @InterfaceC5670cr1
    /* renamed from: g */
    public C4377Tx1<Long, Long> u0() {
        return new C4377Tx1<>(this.Y0, this.Z0);
    }

    public final boolean h(long j, long j2) {
        if (j <= j2) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC9015qV
    @InterfaceC11300zs1
    public String i() {
        if (TextUtils.isEmpty(this.X)) {
            return null;
        }
        return this.X.toString();
    }

    public final void k(@InterfaceC5670cr1 TextInputLayout textInputLayout, @InterfaceC5670cr1 TextInputLayout textInputLayout2) {
        textInputLayout.setError(this.Y);
        textInputLayout2.setError(C4500Ve2.b);
    }

    @Override // o.InterfaceC9015qV
    public View l(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, @InterfaceC11300zs1 Bundle bundle, com.google.android.material.datepicker.a aVar, @InterfaceC5670cr1 AbstractC6912hv1<C4377Tx1<Long, Long>> abstractC6912hv1) {
        String h;
        boolean z = false;
        View inflate = layoutInflater.inflate(C7025iN1.k.mtrl_picker_text_input_date_range, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(C7025iN1.h.mtrl_picker_text_input_range_start);
        TextInputLayout textInputLayout2 = (TextInputLayout) inflate.findViewById(C7025iN1.h.mtrl_picker_text_input_range_end);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        Integer f = C9179r91.f(inflate.getContext(), C7025iN1.c.colorOnSurfaceVariant);
        if (f != null) {
            editText.setHintTextColor(f.intValue());
            editText2.setHintTextColor(f.intValue());
        }
        if (D71.b()) {
            editText.setInputType(17);
            editText2.setInputType(17);
        }
        this.Y = inflate.getResources().getString(C7025iN1.m.mtrl_picker_invalid_range);
        SimpleDateFormat simpleDateFormat = this.c1;
        if (simpleDateFormat != null) {
            z = true;
        }
        if (!z) {
            simpleDateFormat = C11143zD2.g();
        }
        SimpleDateFormat simpleDateFormat2 = simpleDateFormat;
        Long l = this.Y0;
        if (l != null) {
            editText.setText(simpleDateFormat2.format(l));
            this.a1 = this.Y0;
        }
        Long l2 = this.Z0;
        if (l2 != null) {
            editText2.setText(simpleDateFormat2.format(l2));
            this.b1 = this.Z0;
        }
        if (z) {
            h = simpleDateFormat2.toPattern();
        } else {
            h = C11143zD2.h(inflate.getResources(), simpleDateFormat2);
        }
        String str = h;
        textInputLayout.setPlaceholderText(str);
        textInputLayout2.setPlaceholderText(str);
        editText.addTextChangedListener(new a(str, simpleDateFormat2, textInputLayout, aVar, textInputLayout, textInputLayout2, abstractC6912hv1));
        editText2.addTextChangedListener(new b(str, simpleDateFormat2, textInputLayout2, aVar, textInputLayout, textInputLayout2, abstractC6912hv1));
        if (!InterfaceC9015qV.Q(inflate.getContext())) {
            InterfaceC9015qV.j0(editText, editText2);
        }
        return inflate;
    }

    @Override // o.InterfaceC9015qV
    /* renamed from: m */
    public void b0(@InterfaceC5670cr1 C4377Tx1<Long, Long> c4377Tx1) {
        Long valueOf;
        Long l = c4377Tx1.a;
        if (l != null && c4377Tx1.b != null) {
            C10907yF1.a(h(l.longValue(), c4377Tx1.b.longValue()));
        }
        Long l2 = c4377Tx1.a;
        Long l3 = null;
        if (l2 == null) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(C11143zD2.a(l2.longValue()));
        }
        this.Y0 = valueOf;
        Long l4 = c4377Tx1.b;
        if (l4 != null) {
            l3 = Long.valueOf(C11143zD2.a(l4.longValue()));
        }
        this.Z0 = l3;
    }

    public final void n(@InterfaceC5670cr1 TextInputLayout textInputLayout, @InterfaceC5670cr1 TextInputLayout textInputLayout2) {
        if (!TextUtils.isEmpty(textInputLayout.getError())) {
            this.X = textInputLayout.getError();
        } else if (!TextUtils.isEmpty(textInputLayout2.getError())) {
            this.X = textInputLayout2.getError();
        } else {
            this.X = null;
        }
    }

    @Override // o.InterfaceC9015qV
    public void n0(@InterfaceC11300zs1 SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat != null) {
            simpleDateFormat = (SimpleDateFormat) C11143zD2.q(simpleDateFormat);
        }
        this.c1 = simpleDateFormat;
    }

    public final void o(@InterfaceC5670cr1 TextInputLayout textInputLayout, @InterfaceC5670cr1 TextInputLayout textInputLayout2, @InterfaceC5670cr1 AbstractC6912hv1<C4377Tx1<Long, Long>> abstractC6912hv1) {
        Long l = this.a1;
        if (l != null && this.b1 != null) {
            if (h(l.longValue(), this.b1.longValue())) {
                this.Y0 = this.a1;
                this.Z0 = this.b1;
                abstractC6912hv1.b(u0());
            } else {
                k(textInputLayout, textInputLayout2);
                abstractC6912hv1.a();
            }
        } else {
            f(textInputLayout, textInputLayout2);
            abstractC6912hv1.a();
        }
        n(textInputLayout, textInputLayout2);
    }

    @Override // o.InterfaceC9015qV
    public int p() {
        return C7025iN1.m.mtrl_picker_range_header_title;
    }

    @Override // o.InterfaceC9015qV
    public boolean p0() {
        Long l = this.Y0;
        if (l != null && this.Z0 != null && h(l.longValue(), this.Z0.longValue())) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC9015qV
    @InterfaceC5670cr1
    public Collection<Long> r0() {
        ArrayList arrayList = new ArrayList();
        Long l = this.Y0;
        if (l != null) {
            arrayList.add(l);
        }
        Long l2 = this.Z0;
        if (l2 != null) {
            arrayList.add(l2);
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
        parcel.writeValue(this.Y0);
        parcel.writeValue(this.Z0);
    }
}

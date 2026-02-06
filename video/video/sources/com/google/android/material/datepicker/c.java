package com.google.android.material.datepicker;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import o.C11143zD2;
import o.C5655cn2;
import o.C7025iN1;
import o.C9507sV;
import o.Hw2;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public abstract class c extends C5655cn2 {
    @InterfaceC5670cr1
    public final TextInputLayout X;
    public final String Y;
    public final a Y0;
    public final DateFormat Z;
    public final String Z0;
    public final Runnable a1;
    public Runnable b1;
    public int c1 = 0;

    public c(final String str, DateFormat dateFormat, @InterfaceC5670cr1 TextInputLayout textInputLayout, a aVar) {
        this.Y = str;
        this.Z = dateFormat;
        this.X = textInputLayout;
        this.Y0 = aVar;
        this.Z0 = textInputLayout.getContext().getString(C7025iN1.m.mtrl_picker_out_of_range);
        this.a1 = new Runnable() { // from class: o.fV
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.material.datepicker.c.b(com.google.android.material.datepicker.c.this, str);
            }
        };
    }

    public static /* synthetic */ void a(c cVar, long j) {
        cVar.getClass();
        cVar.X.setError(String.format(cVar.Z0, cVar.g(C9507sV.c(j))));
        cVar.d();
    }

    public static /* synthetic */ void b(c cVar, String str) {
        TextInputLayout textInputLayout = cVar.X;
        DateFormat dateFormat = cVar.Z;
        Context context = textInputLayout.getContext();
        String string = context.getString(C7025iN1.m.mtrl_picker_invalid_format);
        String format = String.format(context.getString(C7025iN1.m.mtrl_picker_invalid_format_use), cVar.g(str));
        String format2 = String.format(context.getString(C7025iN1.m.mtrl_picker_invalid_format_example), cVar.g(dateFormat.format(new Date(C11143zD2.v().getTimeInMillis()))));
        textInputLayout.setError(string + "\n" + format + "\n" + format2);
        cVar.d();
    }

    @Override // o.C5655cn2, android.text.TextWatcher
    public void afterTextChanged(@InterfaceC5670cr1 Editable editable) {
        if (!Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage()) && editable.length() != 0 && editable.length() < this.Y.length() && editable.length() >= this.c1) {
            char charAt = this.Y.charAt(editable.length());
            if (!Character.isLetterOrDigit(charAt)) {
                editable.append(charAt);
            }
        }
    }

    @Override // o.C5655cn2, android.text.TextWatcher
    public void beforeTextChanged(@InterfaceC5670cr1 CharSequence charSequence, int i, int i2, int i3) {
        this.c1 = charSequence.length();
    }

    public final Runnable c(final long j) {
        return new Runnable() { // from class: o.gV
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.material.datepicker.c.a(com.google.android.material.datepicker.c.this, j);
            }
        };
    }

    public void d() {
    }

    public abstract void e(@InterfaceC11300zs1 Long l);

    public void f(View view, Runnable runnable) {
        view.post(runnable);
    }

    public final String g(String str) {
        return str.replace(' ', Hw2.g);
    }

    @Override // o.C5655cn2, android.text.TextWatcher
    public void onTextChanged(@InterfaceC5670cr1 CharSequence charSequence, int i, int i2, int i3) {
        this.X.removeCallbacks(this.a1);
        this.X.removeCallbacks(this.b1);
        this.X.setError(null);
        e(null);
        if (!TextUtils.isEmpty(charSequence) && charSequence.length() >= this.Y.length()) {
            try {
                Date parse = this.Z.parse(charSequence.toString());
                this.X.setError(null);
                long time = parse.getTime();
                if (this.Y0.g().M(time) && this.Y0.v(time)) {
                    e(Long.valueOf(parse.getTime()));
                    return;
                }
                Runnable c = c(time);
                this.b1 = c;
                f(this.X, c);
            } catch (ParseException unused) {
                f(this.X, this.a1);
            }
        }
    }
}

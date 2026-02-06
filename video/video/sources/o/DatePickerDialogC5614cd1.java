package o;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import o.C7025iN1;
import o.HT1;

@HT1({HT1.a.Y, HT1.a.Z0})
/* renamed from: o.cd1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class DatePickerDialogC5614cd1 extends DatePickerDialog {
    @InterfaceC4698Xf2
    public static final int Y0 = C7025iN1.n.MaterialAlertDialog_MaterialComponents_Picker_Date_Spinner;
    @InterfaceC8568og
    public static final int Z = 16843612;
    @InterfaceC5670cr1
    public final Drawable X;
    @InterfaceC5670cr1
    public final Rect Y;

    public DatePickerDialogC5614cd1(@InterfaceC5670cr1 Context context) {
        this(context, 0);
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(this.X);
        getWindow().getDecorView().setOnTouchListener(new View$OnTouchListenerC8997qQ0(this, this.Y));
    }

    public DatePickerDialogC5614cd1(@InterfaceC5670cr1 Context context, int i) {
        this(context, i, null, -1, -1, -1);
    }

    public DatePickerDialogC5614cd1(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 DatePickerDialog.OnDateSetListener onDateSetListener, int i, int i2, int i3) {
        this(context, 0, onDateSetListener, i, i2, i3);
    }

    public DatePickerDialogC5614cd1(@InterfaceC5670cr1 Context context, int i, @InterfaceC11300zs1 DatePickerDialog.OnDateSetListener onDateSetListener, int i2, int i3, int i4) {
        super(context, i, onDateSetListener, i2, i3, i4);
        Context context2 = getContext();
        int g = X81.g(getContext(), C7025iN1.c.colorSurface, getClass().getCanonicalName());
        int i5 = Y0;
        C4394Uc1 c4394Uc1 = new C4394Uc1(context2, null, Z, i5);
        c4394Uc1.y0(ColorStateList.valueOf(g));
        Rect a = C10883y91.a(context2, Z, i5);
        this.Y = a;
        this.X = C10883y91.b(c4394Uc1, a);
    }
}

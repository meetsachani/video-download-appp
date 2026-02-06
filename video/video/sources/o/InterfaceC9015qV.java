package o;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import java.text.SimpleDateFormat;
import java.util.Collection;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.qV  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC9015qV<S> extends Parcelable {
    static /* synthetic */ void F(EditText[] editTextArr, View view, boolean z) {
        for (EditText editText : editTextArr) {
            if (editText.hasFocus()) {
                return;
            }
        }
        C10920yI2.r(view, false);
    }

    static boolean Q(@InterfaceC5670cr1 Context context) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        return false;
    }

    static void j0(@InterfaceC5670cr1 final EditText... editTextArr) {
        if (editTextArr.length == 0) {
            return;
        }
        View.OnFocusChangeListener onFocusChangeListener = new View.OnFocusChangeListener() { // from class: o.oV
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                InterfaceC9015qV.F(editTextArr, view, z);
            }
        };
        for (EditText editText : editTextArr) {
            editText.setOnFocusChangeListener(onFocusChangeListener);
        }
        final EditText editText2 = editTextArr[0];
        editText2.postDelayed(new Runnable() { // from class: o.pV
            @Override // java.lang.Runnable
            public final void run() {
                C10920yI2.y(editText2, false);
            }
        }, 100L);
    }

    void C0(long j);

    @InterfaceC5670cr1
    String G(@InterfaceC5670cr1 Context context);

    @InterfaceC4698Xf2
    int H(Context context);

    @InterfaceC5670cr1
    String U(Context context);

    @InterfaceC5670cr1
    Collection<C4377Tx1<Long, Long>> V();

    void b0(@InterfaceC5670cr1 S s);

    @InterfaceC11300zs1
    String i();

    @InterfaceC5670cr1
    View l(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, @InterfaceC11300zs1 Bundle bundle, @InterfaceC5670cr1 com.google.android.material.datepicker.a aVar, @InterfaceC5670cr1 AbstractC6912hv1<S> abstractC6912hv1);

    void n0(@InterfaceC11300zs1 SimpleDateFormat simpleDateFormat);

    @InterfaceC3329Je2
    int p();

    boolean p0();

    @InterfaceC5670cr1
    Collection<Long> r0();

    @InterfaceC11300zs1
    S u0();
}

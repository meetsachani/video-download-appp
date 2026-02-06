package o;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;
import o.C7025iN1;

/* renamed from: o.wV  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C10482wV extends BaseAdapter {
    public static final int Y0 = 4;
    public static final int Z0;
    @InterfaceC5670cr1
    public final Calendar X;
    public final int Y;
    public final int Z;

    static {
        int i;
        if (Build.VERSION.SDK_INT >= 26) {
            i = 4;
        } else {
            i = 1;
        }
        Z0 = i;
    }

    public C10482wV() {
        Calendar x = C11143zD2.x();
        this.X = x;
        this.Y = x.getMaximum(7);
        this.Z = x.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    @InterfaceC11300zs1
    /* renamed from: a */
    public Integer getItem(int i) {
        if (i >= this.Y) {
            return null;
        }
        return Integer.valueOf(b(i));
    }

    public final int b(int i) {
        int i2 = i + this.Z;
        int i3 = this.Y;
        if (i2 > i3) {
            return i2 - i3;
        }
        return i2;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.Y;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @InterfaceC11300zs1
    @SuppressLint({"WrongConstant"})
    public View getView(int i, @InterfaceC11300zs1 View view, @InterfaceC5670cr1 ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C7025iN1.k.mtrl_calendar_day_of_week, viewGroup, false);
        }
        this.X.set(7, b(i));
        textView.setText(this.X.getDisplayName(7, Z0, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(C7025iN1.m.mtrl_picker_day_of_week_column_header), this.X.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public C10482wV(int i) {
        Calendar x = C11143zD2.x();
        this.X = x;
        this.Y = x.getMaximum(7);
        this.Z = i;
    }
}

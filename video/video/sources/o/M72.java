package o;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
public class M72 extends AbstractC7049iT1 {
    public int[] j1;
    public int[] k1;
    public int l1;
    public a m1;
    public b n1;
    public String[] o1;

    /* loaded from: classes.dex */
    public interface a {
        CharSequence convertToString(Cursor cursor);
    }

    /* loaded from: classes.dex */
    public interface b {
        boolean setViewValue(View view, Cursor cursor, int i);
    }

    @Deprecated
    public M72(Context context, int i, Cursor cursor, String[] strArr, int[] iArr) {
        super(context, i, cursor);
        this.l1 = -1;
        this.k1 = iArr;
        this.o1 = strArr;
        z(cursor, strArr);
    }

    public a A() {
        return this.m1;
    }

    public int B() {
        return this.l1;
    }

    public b C() {
        return this.n1;
    }

    public void D(a aVar) {
        this.m1 = aVar;
    }

    public void E(int i) {
        this.l1 = i;
    }

    public void F(b bVar) {
        this.n1 = bVar;
    }

    public void G(ImageView imageView, String str) {
        try {
            imageView.setImageResource(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            imageView.setImageURI(Uri.parse(str));
        }
    }

    public void H(TextView textView, String str) {
        textView.setText(str);
    }

    @Override // o.AbstractC9004qS, o.C9253rS.a
    public CharSequence convertToString(Cursor cursor) {
        a aVar = this.m1;
        if (aVar != null) {
            return aVar.convertToString(cursor);
        }
        int i = this.l1;
        if (i > -1) {
            return cursor.getString(i);
        }
        return super.convertToString(cursor);
    }

    @Override // o.AbstractC9004qS
    public void d(View view, Context context, Cursor cursor) {
        boolean z;
        b bVar = this.n1;
        int[] iArr = this.k1;
        int length = iArr.length;
        int[] iArr2 = this.j1;
        for (int i = 0; i < length; i++) {
            View findViewById = view.findViewById(iArr[i]);
            if (findViewById != null) {
                if (bVar != null) {
                    z = bVar.setViewValue(findViewById, cursor, iArr2[i]);
                } else {
                    z = false;
                }
                if (z) {
                    continue;
                } else {
                    String string = cursor.getString(iArr2[i]);
                    if (string == null) {
                        string = "";
                    }
                    if (findViewById instanceof TextView) {
                        H((TextView) findViewById, string);
                    } else if (findViewById instanceof ImageView) {
                        G((ImageView) findViewById, string);
                    } else {
                        throw new IllegalStateException(findViewById.getClass().getName() + " is not a  view that can be bounds by this SimpleCursorAdapter");
                    }
                }
            }
        }
    }

    @Override // o.AbstractC9004qS
    public Cursor v(Cursor cursor) {
        z(cursor, this.o1);
        return super.v(cursor);
    }

    public void y(Cursor cursor, String[] strArr, int[] iArr) {
        this.o1 = strArr;
        this.k1 = iArr;
        z(cursor, strArr);
        super.a(cursor);
    }

    public final void z(Cursor cursor, String[] strArr) {
        if (cursor != null) {
            int length = strArr.length;
            int[] iArr = this.j1;
            if (iArr == null || iArr.length != length) {
                this.j1 = new int[length];
            }
            for (int i = 0; i < length; i++) {
                this.j1[i] = cursor.getColumnIndexOrThrow(strArr[i]);
            }
            return;
        }
        this.j1 = null;
    }

    public M72(Context context, int i, Cursor cursor, String[] strArr, int[] iArr, int i2) {
        super(context, i, cursor, i2);
        this.l1 = -1;
        this.k1 = iArr;
        this.o1 = strArr;
        z(cursor, strArr);
    }
}

package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.IOException;

/* renamed from: o.Jn  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3362Jn<DataType> implements InterfaceC7290jT1<DataType, BitmapDrawable> {
    public final InterfaceC7290jT1<DataType, Bitmap> a;
    public final Resources b;

    public C3362Jn(Context context, InterfaceC7290jT1<DataType, Bitmap> interfaceC7290jT1) {
        this(context.getResources(), interfaceC7290jT1);
    }

    @Override // o.InterfaceC7290jT1
    public boolean a(DataType datatype, C5448bw1 c5448bw1) throws IOException {
        return this.a.a(datatype, c5448bw1);
    }

    @Override // o.InterfaceC7290jT1
    public InterfaceC5580cT1<BitmapDrawable> b(DataType datatype, int i, int i2, C5448bw1 c5448bw1) throws IOException {
        return HY0.e(this.b, this.a.b(datatype, i, i2, c5448bw1));
    }

    @Deprecated
    public C3362Jn(Resources resources, InterfaceC4931Zn interfaceC4931Zn, InterfaceC7290jT1<DataType, Bitmap> interfaceC7290jT1) {
        this(resources, interfaceC7290jT1);
    }

    public C3362Jn(Resources resources, InterfaceC7290jT1<DataType, Bitmap> interfaceC7290jT1) {
        this.b = (Resources) C10175vF1.e(resources);
        this.a = (InterfaceC7290jT1) C10175vF1.e(interfaceC7290jT1);
    }
}

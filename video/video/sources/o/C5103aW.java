package o;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import o.FE1;

/* renamed from: o.aW  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5103aW<DataType, ResourceType, Transcode> {
    public static final String f = "DecodePath";
    public final Class<DataType> a;
    public final List<? extends InterfaceC7290jT1<DataType, ResourceType>> b;
    public final InterfaceC9502sT1<ResourceType, Transcode> c;
    public final FE1.a<List<Throwable>> d;
    public final String e;

    /* renamed from: o.aW$a */
    /* loaded from: classes.dex */
    public interface a<ResourceType> {
        InterfaceC5580cT1<ResourceType> a(InterfaceC5580cT1<ResourceType> interfaceC5580cT1);
    }

    public C5103aW(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends InterfaceC7290jT1<DataType, ResourceType>> list, InterfaceC9502sT1<ResourceType, Transcode> interfaceC9502sT1, FE1.a<List<Throwable>> aVar) {
        this.a = cls;
        this.b = list;
        this.c = interfaceC9502sT1;
        this.d = aVar;
        this.e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public InterfaceC5580cT1<Transcode> a(com.bumptech.glide.load.data.a<DataType> aVar, int i, int i2, C5448bw1 c5448bw1, a<ResourceType> aVar2) throws TD0 {
        return this.c.a(aVar2.a(b(aVar, i, i2, c5448bw1)), c5448bw1);
    }

    public final InterfaceC5580cT1<ResourceType> b(com.bumptech.glide.load.data.a<DataType> aVar, int i, int i2, C5448bw1 c5448bw1) throws TD0 {
        List<Throwable> list = (List) C10175vF1.e(this.d.a());
        try {
            return c(aVar, i, i2, c5448bw1, list);
        } finally {
            this.d.b(list);
        }
    }

    public final InterfaceC5580cT1<ResourceType> c(com.bumptech.glide.load.data.a<DataType> aVar, int i, int i2, C5448bw1 c5448bw1, List<Throwable> list) throws TD0 {
        int size = this.b.size();
        InterfaceC5580cT1<ResourceType> interfaceC5580cT1 = null;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC7290jT1<DataType, ResourceType> interfaceC7290jT1 = this.b.get(i3);
            try {
                if (interfaceC7290jT1.a(aVar.c(), c5448bw1)) {
                    interfaceC5580cT1 = interfaceC7290jT1.b(aVar.c(), i, i2, c5448bw1);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable(f, 2)) {
                    Log.v(f, "Failed to decode data for " + interfaceC7290jT1, e);
                }
                list.add(e);
            }
            if (interfaceC5580cT1 != null) {
                break;
            }
        }
        if (interfaceC5580cT1 != null) {
            return interfaceC5580cT1;
        }
        throw new TD0(this.e, new ArrayList(list));
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.a + ", decoders=" + this.b + ", transcoder=" + this.c + '}';
    }
}

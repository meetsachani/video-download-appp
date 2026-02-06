package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.C5103aW;
import o.FE1;

/* loaded from: classes.dex */
public class O11<Data, ResourceType, Transcode> {
    public final Class<Data> a;
    public final FE1.a<List<Throwable>> b;
    public final List<? extends C5103aW<Data, ResourceType, Transcode>> c;
    public final String d;

    public O11(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<C5103aW<Data, ResourceType, Transcode>> list, FE1.a<List<Throwable>> aVar) {
        this.a = cls;
        this.b = aVar;
        this.c = (List) C10175vF1.d(list);
        this.d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public Class<Data> a() {
        return this.a;
    }

    public InterfaceC5580cT1<Transcode> b(com.bumptech.glide.load.data.a<Data> aVar, C5448bw1 c5448bw1, int i, int i2, C5103aW.a<ResourceType> aVar2) throws TD0 {
        List<Throwable> list = (List) C10175vF1.e(this.b.a());
        try {
            return c(aVar, c5448bw1, i, i2, aVar2, list);
        } finally {
            this.b.b(list);
        }
    }

    public final InterfaceC5580cT1<Transcode> c(com.bumptech.glide.load.data.a<Data> aVar, C5448bw1 c5448bw1, int i, int i2, C5103aW.a<ResourceType> aVar2, List<Throwable> list) throws TD0 {
        int size = this.c.size();
        InterfaceC5580cT1<Transcode> interfaceC5580cT1 = null;
        for (int i3 = 0; i3 < size; i3++) {
            try {
                interfaceC5580cT1 = this.c.get(i3).a(aVar, i, i2, c5448bw1, aVar2);
            } catch (TD0 e) {
                list.add(e);
            }
            if (interfaceC5580cT1 != null) {
                break;
            }
        }
        if (interfaceC5580cT1 != null) {
            return interfaceC5580cT1;
        }
        throw new TD0(this.d, new ArrayList(list));
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.c.toArray()) + '}';
    }
}

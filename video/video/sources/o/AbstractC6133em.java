package o;

import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import java.util.List;

@InterfaceC6615gi
@Encodable
/* renamed from: o.em  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6133em {
    @InterfaceC5670cr1
    public static AbstractC6133em a(@InterfaceC5670cr1 List<AbstractC4995a41> list) {
        return new C9311ri(list);
    }

    @InterfaceC5670cr1
    public static DataEncoder b() {
        return new JsonDataEncoderBuilder().k(C4412Uh.b).l(true).j();
    }

    @InterfaceC5670cr1
    @Encodable.Field(name = "logRequest")
    public abstract List<AbstractC4995a41> c();
}

package o;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.io.Reader;

@InterfaceC6615gi
/* renamed from: o.b41  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5238b41 {
    public static final String a = "LogResponseInternal";

    public static AbstractC5238b41 a(long j) {
        return new C4610Wi(j);
    }

    @InterfaceC5670cr1
    public static AbstractC5238b41 b(@InterfaceC5670cr1 Reader reader) throws IOException {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        return a(Long.parseLong(jsonReader.nextString()));
                    }
                    return a(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    public abstract long c();
}

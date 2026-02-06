package o;

import android.adservices.topics.GetTopicsRequest;
import android.content.Context;

/* renamed from: o.Gq2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3083Gq2 extends C3963Pq2 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3083Gq2(Context context) {
        super(C2484Aq2.a(r2));
        C6562gT0.p(context, "context");
        Object systemService = context.getSystemService(C11293zq2.a());
        C6562gT0.o(systemService, "context.getSystemService…opicsManager::class.java)");
    }

    @Override // o.C3963Pq2
    public GetTopicsRequest e(C5273bD0 c5273bD0) {
        GetTopicsRequest.Builder adsSdkName;
        GetTopicsRequest.Builder shouldRecordObservation;
        GetTopicsRequest build;
        C6562gT0.p(c5273bD0, "request");
        adsSdkName = C2985Fq2.a().setAdsSdkName(c5273bD0.a());
        shouldRecordObservation = adsSdkName.setShouldRecordObservation(c5273bD0.b());
        build = shouldRecordObservation.build();
        C6562gT0.o(build, "Builder()\n            .s…ion)\n            .build()");
        return build;
    }
}

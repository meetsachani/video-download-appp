package com.google.firebase.remoteconfig.interop.rollouts;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class AutoRolloutAssignmentEncoder implements Configurator {
    public static final int a = 2;
    public static final Configurator b = new AutoRolloutAssignmentEncoder();

    /* loaded from: classes3.dex */
    public static final class RolloutAssignmentEncoder implements ObjectEncoder<RolloutAssignment> {
        public static final RolloutAssignmentEncoder a = new RolloutAssignmentEncoder();
        public static final FieldDescriptor b = FieldDescriptor.d("rolloutId");
        public static final FieldDescriptor c = FieldDescriptor.d("variantId");
        public static final FieldDescriptor d = FieldDescriptor.d(RolloutAssignment.c);
        public static final FieldDescriptor e = FieldDescriptor.d(RolloutAssignment.d);
        public static final FieldDescriptor f = FieldDescriptor.d("templateVersion");

        private RolloutAssignmentEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(RolloutAssignment rolloutAssignment, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.k(b, rolloutAssignment.f());
            objectEncoderContext.k(c, rolloutAssignment.h());
            objectEncoderContext.k(d, rolloutAssignment.d());
            objectEncoderContext.k(e, rolloutAssignment.e());
            objectEncoderContext.b(f, rolloutAssignment.g());
        }
    }

    private AutoRolloutAssignmentEncoder() {
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void a(EncoderConfig<?> encoderConfig) {
        RolloutAssignmentEncoder rolloutAssignmentEncoder = RolloutAssignmentEncoder.a;
        encoderConfig.b(RolloutAssignment.class, rolloutAssignmentEncoder);
        encoderConfig.b(AutoValue_RolloutAssignment.class, rolloutAssignmentEncoder);
    }
}

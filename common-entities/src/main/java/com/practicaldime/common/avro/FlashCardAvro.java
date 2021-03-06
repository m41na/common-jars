/**
 * Autogenerated by Avro
 * <p>
 * DO NOT EDIT DIRECTLY
 */
package com.practicaldime.common.avro;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;

@org.apache.avro.specific.AvroGenerated
public class FlashCardAvro extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
    public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"FlashCardAvro\",\"namespace\":\"com.practicaldime.common.avro\",\"fields\":[{\"name\":\"refId\",\"type\":\"long\"},{\"name\":\"teamId\",\"type\":\"long\"},{\"name\":\"profileId\",\"type\":\"long\"},{\"name\":\"team\",\"type\":\"string\"},{\"name\":\"player\",\"type\":\"string\"},{\"name\":\"topic\",\"type\":\"string\"},{\"name\":\"pick\",\"type\":\"string\"},{\"name\":\"submitTime\",\"type\":\"string\"}]}");
    private static final long serialVersionUID = 4703935706448221641L;
    private static SpecificData MODEL$ = new SpecificData();
    private static final BinaryMessageEncoder<FlashCardAvro> ENCODER =
            new BinaryMessageEncoder<FlashCardAvro>(MODEL$, SCHEMA$);
    private static final BinaryMessageDecoder<FlashCardAvro> DECODER =
            new BinaryMessageDecoder<FlashCardAvro>(MODEL$, SCHEMA$);
    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumWriter<FlashCardAvro>
            WRITER$ = (org.apache.avro.io.DatumWriter<FlashCardAvro>) MODEL$.createDatumWriter(SCHEMA$);
    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumReader<FlashCardAvro>
            READER$ = (org.apache.avro.io.DatumReader<FlashCardAvro>) MODEL$.createDatumReader(SCHEMA$);
    @Deprecated
    public long refId;
    @Deprecated
    public long teamId;
    @Deprecated
    public long profileId;
    @Deprecated
    public java.lang.CharSequence team;
    @Deprecated
    public java.lang.CharSequence player;
    @Deprecated
    public java.lang.CharSequence topic;
    @Deprecated
    public java.lang.CharSequence pick;
    @Deprecated
    public java.lang.CharSequence submitTime;
    /**
     * Default constructor.  Note that this does not initialize fields
     * to their default values from the schema.  If that is desired then
     * one should use <code>newBuilder()</code>.
     */
    public FlashCardAvro() {
    }
    /**
     * All-args constructor.
     * @param refId The new value for refId
     * @param teamId The new value for teamId
     * @param profileId The new value for profileId
     * @param team The new value for team
     * @param player The new value for player
     * @param topic The new value for topic
     * @param pick The new value for pick
     * @param submitTime The new value for submitTime
     */
    public FlashCardAvro(java.lang.Long refId, java.lang.Long teamId, java.lang.Long profileId, java.lang.CharSequence team, java.lang.CharSequence player, java.lang.CharSequence topic, java.lang.CharSequence pick, java.lang.CharSequence submitTime) {
        this.refId = refId;
        this.teamId = teamId;
        this.profileId = profileId;
        this.team = team;
        this.player = player;
        this.topic = topic;
        this.pick = pick;
        this.submitTime = submitTime;
    }

    public static org.apache.avro.Schema getClassSchema() {
        return SCHEMA$;
    }

    /**
     * Return the BinaryMessageEncoder instance used by this class.
     * @return the message encoder used by this class
     */
    public static BinaryMessageEncoder<FlashCardAvro> getEncoder() {
        return ENCODER;
    }

    /**
     * Return the BinaryMessageDecoder instance used by this class.
     * @return the message decoder used by this class
     */
    public static BinaryMessageDecoder<FlashCardAvro> getDecoder() {
        return DECODER;
    }

    /**
     * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
     * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
     * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
     */
    public static BinaryMessageDecoder<FlashCardAvro> createDecoder(SchemaStore resolver) {
        return new BinaryMessageDecoder<FlashCardAvro>(MODEL$, SCHEMA$, resolver);
    }

    /**
     * Deserializes a FlashCardAvro from a ByteBuffer.
     * @param b a byte buffer holding serialized data for an instance of this class
     * @return a FlashCardAvro instance decoded from the given buffer
     * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
     */
    public static FlashCardAvro fromByteBuffer(
            java.nio.ByteBuffer b) throws java.io.IOException {
        return DECODER.decode(b);
    }

    /**
     * Creates a new FlashCardAvro RecordBuilder.
     * @return A new FlashCardAvro RecordBuilder
     */
    public static com.practicaldime.common.avro.FlashCardAvro.Builder newBuilder() {
        return new com.practicaldime.common.avro.FlashCardAvro.Builder();
    }

    /**
     * Creates a new FlashCardAvro RecordBuilder by copying an existing Builder.
     * @param other The existing builder to copy.
     * @return A new FlashCardAvro RecordBuilder
     */
    public static com.practicaldime.common.avro.FlashCardAvro.Builder newBuilder(com.practicaldime.common.avro.FlashCardAvro.Builder other) {
        if (other == null) {
            return new com.practicaldime.common.avro.FlashCardAvro.Builder();
        } else {
            return new com.practicaldime.common.avro.FlashCardAvro.Builder(other);
        }
    }

    /**
     * Creates a new FlashCardAvro RecordBuilder by copying an existing FlashCardAvro instance.
     * @param other The existing instance to copy.
     * @return A new FlashCardAvro RecordBuilder
     */
    public static com.practicaldime.common.avro.FlashCardAvro.Builder newBuilder(com.practicaldime.common.avro.FlashCardAvro other) {
        if (other == null) {
            return new com.practicaldime.common.avro.FlashCardAvro.Builder();
        } else {
            return new com.practicaldime.common.avro.FlashCardAvro.Builder(other);
        }
    }

    /**
     * Serializes this FlashCardAvro to a ByteBuffer.
     * @return a buffer holding the serialized data for this instance
     * @throws java.io.IOException if this instance could not be serialized
     */
    public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
        return ENCODER.encode(this);
    }

    public org.apache.avro.specific.SpecificData getSpecificData() {
        return MODEL$;
    }

    public org.apache.avro.Schema getSchema() {
        return SCHEMA$;
    }

    // Used by DatumWriter.  Applications should not call.
    public java.lang.Object get(int field$) {
        switch (field$) {
            case 0:
                return refId;
            case 1:
                return teamId;
            case 2:
                return profileId;
            case 3:
                return team;
            case 4:
                return player;
            case 5:
                return topic;
            case 6:
                return pick;
            case 7:
                return submitTime;
            default:
                throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    // Used by DatumReader.  Applications should not call.
    @SuppressWarnings(value = "unchecked")
    public void put(int field$, java.lang.Object value$) {
        switch (field$) {
            case 0:
                refId = (java.lang.Long) value$;
                break;
            case 1:
                teamId = (java.lang.Long) value$;
                break;
            case 2:
                profileId = (java.lang.Long) value$;
                break;
            case 3:
                team = (java.lang.CharSequence) value$;
                break;
            case 4:
                player = (java.lang.CharSequence) value$;
                break;
            case 5:
                topic = (java.lang.CharSequence) value$;
                break;
            case 6:
                pick = (java.lang.CharSequence) value$;
                break;
            case 7:
                submitTime = (java.lang.CharSequence) value$;
                break;
            default:
                throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    /**
     * Gets the value of the 'refId' field.
     * @return The value of the 'refId' field.
     */
    public long getRefId() {
        return refId;
    }

    /**
     * Sets the value of the 'refId' field.
     * @param value the value to set.
     */
    public void setRefId(long value) {
        this.refId = value;
    }

    /**
     * Gets the value of the 'teamId' field.
     * @return The value of the 'teamId' field.
     */
    public long getTeamId() {
        return teamId;
    }

    /**
     * Sets the value of the 'teamId' field.
     * @param value the value to set.
     */
    public void setTeamId(long value) {
        this.teamId = value;
    }

    /**
     * Gets the value of the 'profileId' field.
     * @return The value of the 'profileId' field.
     */
    public long getProfileId() {
        return profileId;
    }

    /**
     * Sets the value of the 'profileId' field.
     * @param value the value to set.
     */
    public void setProfileId(long value) {
        this.profileId = value;
    }

    /**
     * Gets the value of the 'team' field.
     * @return The value of the 'team' field.
     */
    public java.lang.CharSequence getTeam() {
        return team;
    }

    /**
     * Sets the value of the 'team' field.
     * @param value the value to set.
     */
    public void setTeam(java.lang.CharSequence value) {
        this.team = value;
    }

    /**
     * Gets the value of the 'player' field.
     * @return The value of the 'player' field.
     */
    public java.lang.CharSequence getPlayer() {
        return player;
    }

    /**
     * Sets the value of the 'player' field.
     * @param value the value to set.
     */
    public void setPlayer(java.lang.CharSequence value) {
        this.player = value;
    }

    /**
     * Gets the value of the 'topic' field.
     * @return The value of the 'topic' field.
     */
    public java.lang.CharSequence getTopic() {
        return topic;
    }

    /**
     * Sets the value of the 'topic' field.
     * @param value the value to set.
     */
    public void setTopic(java.lang.CharSequence value) {
        this.topic = value;
    }

    /**
     * Gets the value of the 'pick' field.
     * @return The value of the 'pick' field.
     */
    public java.lang.CharSequence getPick() {
        return pick;
    }

    /**
     * Sets the value of the 'pick' field.
     * @param value the value to set.
     */
    public void setPick(java.lang.CharSequence value) {
        this.pick = value;
    }

    /**
     * Gets the value of the 'submitTime' field.
     * @return The value of the 'submitTime' field.
     */
    public java.lang.CharSequence getSubmitTime() {
        return submitTime;
    }

    /**
     * Sets the value of the 'submitTime' field.
     * @param value the value to set.
     */
    public void setSubmitTime(java.lang.CharSequence value) {
        this.submitTime = value;
    }

    @Override
    public void writeExternal(java.io.ObjectOutput out)
            throws java.io.IOException {
        WRITER$.write(this, SpecificData.getEncoder(out));
    }

    @Override
    public void readExternal(java.io.ObjectInput in)
            throws java.io.IOException {
        READER$.read(this, SpecificData.getDecoder(in));
    }

    @Override
    protected boolean hasCustomCoders() {
        return true;
    }

    @Override
    public void customEncode(org.apache.avro.io.Encoder out)
            throws java.io.IOException {
        out.writeLong(this.refId);

        out.writeLong(this.teamId);

        out.writeLong(this.profileId);

        out.writeString(this.team);

        out.writeString(this.player);

        out.writeString(this.topic);

        out.writeString(this.pick);

        out.writeString(this.submitTime);

    }

    @Override
    public void customDecode(org.apache.avro.io.ResolvingDecoder in)
            throws java.io.IOException {
        org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
        if (fieldOrder == null) {
            this.refId = in.readLong();

            this.teamId = in.readLong();

            this.profileId = in.readLong();

            this.team = in.readString(this.team instanceof Utf8 ? (Utf8) this.team : null);

            this.player = in.readString(this.player instanceof Utf8 ? (Utf8) this.player : null);

            this.topic = in.readString(this.topic instanceof Utf8 ? (Utf8) this.topic : null);

            this.pick = in.readString(this.pick instanceof Utf8 ? (Utf8) this.pick : null);

            this.submitTime = in.readString(this.submitTime instanceof Utf8 ? (Utf8) this.submitTime : null);

        } else {
            for (int i = 0; i < 8; i++) {
                switch (fieldOrder[i].pos()) {
                    case 0:
                        this.refId = in.readLong();
                        break;

                    case 1:
                        this.teamId = in.readLong();
                        break;

                    case 2:
                        this.profileId = in.readLong();
                        break;

                    case 3:
                        this.team = in.readString(this.team instanceof Utf8 ? (Utf8) this.team : null);
                        break;

                    case 4:
                        this.player = in.readString(this.player instanceof Utf8 ? (Utf8) this.player : null);
                        break;

                    case 5:
                        this.topic = in.readString(this.topic instanceof Utf8 ? (Utf8) this.topic : null);
                        break;

                    case 6:
                        this.pick = in.readString(this.pick instanceof Utf8 ? (Utf8) this.pick : null);
                        break;

                    case 7:
                        this.submitTime = in.readString(this.submitTime instanceof Utf8 ? (Utf8) this.submitTime : null);
                        break;

                    default:
                        throw new java.io.IOException("Corrupt ResolvingDecoder.");
                }
            }
        }
    }

    /**
     * RecordBuilder for FlashCardAvro instances.
     */
    public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<FlashCardAvro>
            implements org.apache.avro.data.RecordBuilder<FlashCardAvro> {

        private long refId;
        private long teamId;
        private long profileId;
        private java.lang.CharSequence team;
        private java.lang.CharSequence player;
        private java.lang.CharSequence topic;
        private java.lang.CharSequence pick;
        private java.lang.CharSequence submitTime;

        /** Creates a new Builder */
        private Builder() {
            super(SCHEMA$);
        }

        /**
         * Creates a Builder by copying an existing Builder.
         * @param other The existing Builder to copy.
         */
        private Builder(com.practicaldime.common.avro.FlashCardAvro.Builder other) {
            super(other);
            if (isValidValue(fields()[0], other.refId)) {
                this.refId = data().deepCopy(fields()[0].schema(), other.refId);
                fieldSetFlags()[0] = other.fieldSetFlags()[0];
            }
            if (isValidValue(fields()[1], other.teamId)) {
                this.teamId = data().deepCopy(fields()[1].schema(), other.teamId);
                fieldSetFlags()[1] = other.fieldSetFlags()[1];
            }
            if (isValidValue(fields()[2], other.profileId)) {
                this.profileId = data().deepCopy(fields()[2].schema(), other.profileId);
                fieldSetFlags()[2] = other.fieldSetFlags()[2];
            }
            if (isValidValue(fields()[3], other.team)) {
                this.team = data().deepCopy(fields()[3].schema(), other.team);
                fieldSetFlags()[3] = other.fieldSetFlags()[3];
            }
            if (isValidValue(fields()[4], other.player)) {
                this.player = data().deepCopy(fields()[4].schema(), other.player);
                fieldSetFlags()[4] = other.fieldSetFlags()[4];
            }
            if (isValidValue(fields()[5], other.topic)) {
                this.topic = data().deepCopy(fields()[5].schema(), other.topic);
                fieldSetFlags()[5] = other.fieldSetFlags()[5];
            }
            if (isValidValue(fields()[6], other.pick)) {
                this.pick = data().deepCopy(fields()[6].schema(), other.pick);
                fieldSetFlags()[6] = other.fieldSetFlags()[6];
            }
            if (isValidValue(fields()[7], other.submitTime)) {
                this.submitTime = data().deepCopy(fields()[7].schema(), other.submitTime);
                fieldSetFlags()[7] = other.fieldSetFlags()[7];
            }
        }

        /**
         * Creates a Builder by copying an existing FlashCardAvro instance
         * @param other The existing instance to copy.
         */
        private Builder(com.practicaldime.common.avro.FlashCardAvro other) {
            super(SCHEMA$);
            if (isValidValue(fields()[0], other.refId)) {
                this.refId = data().deepCopy(fields()[0].schema(), other.refId);
                fieldSetFlags()[0] = true;
            }
            if (isValidValue(fields()[1], other.teamId)) {
                this.teamId = data().deepCopy(fields()[1].schema(), other.teamId);
                fieldSetFlags()[1] = true;
            }
            if (isValidValue(fields()[2], other.profileId)) {
                this.profileId = data().deepCopy(fields()[2].schema(), other.profileId);
                fieldSetFlags()[2] = true;
            }
            if (isValidValue(fields()[3], other.team)) {
                this.team = data().deepCopy(fields()[3].schema(), other.team);
                fieldSetFlags()[3] = true;
            }
            if (isValidValue(fields()[4], other.player)) {
                this.player = data().deepCopy(fields()[4].schema(), other.player);
                fieldSetFlags()[4] = true;
            }
            if (isValidValue(fields()[5], other.topic)) {
                this.topic = data().deepCopy(fields()[5].schema(), other.topic);
                fieldSetFlags()[5] = true;
            }
            if (isValidValue(fields()[6], other.pick)) {
                this.pick = data().deepCopy(fields()[6].schema(), other.pick);
                fieldSetFlags()[6] = true;
            }
            if (isValidValue(fields()[7], other.submitTime)) {
                this.submitTime = data().deepCopy(fields()[7].schema(), other.submitTime);
                fieldSetFlags()[7] = true;
            }
        }

        /**
         * Gets the value of the 'refId' field.
         * @return The value.
         */
        public long getRefId() {
            return refId;
        }


        /**
         * Sets the value of the 'refId' field.
         * @param value The value of 'refId'.
         * @return This builder.
         */
        public com.practicaldime.common.avro.FlashCardAvro.Builder setRefId(long value) {
            validate(fields()[0], value);
            this.refId = value;
            fieldSetFlags()[0] = true;
            return this;
        }

        /**
         * Checks whether the 'refId' field has been set.
         * @return True if the 'refId' field has been set, false otherwise.
         */
        public boolean hasRefId() {
            return fieldSetFlags()[0];
        }


        /**
         * Clears the value of the 'refId' field.
         * @return This builder.
         */
        public com.practicaldime.common.avro.FlashCardAvro.Builder clearRefId() {
            fieldSetFlags()[0] = false;
            return this;
        }

        /**
         * Gets the value of the 'teamId' field.
         * @return The value.
         */
        public long getTeamId() {
            return teamId;
        }


        /**
         * Sets the value of the 'teamId' field.
         * @param value The value of 'teamId'.
         * @return This builder.
         */
        public com.practicaldime.common.avro.FlashCardAvro.Builder setTeamId(long value) {
            validate(fields()[1], value);
            this.teamId = value;
            fieldSetFlags()[1] = true;
            return this;
        }

        /**
         * Checks whether the 'teamId' field has been set.
         * @return True if the 'teamId' field has been set, false otherwise.
         */
        public boolean hasTeamId() {
            return fieldSetFlags()[1];
        }


        /**
         * Clears the value of the 'teamId' field.
         * @return This builder.
         */
        public com.practicaldime.common.avro.FlashCardAvro.Builder clearTeamId() {
            fieldSetFlags()[1] = false;
            return this;
        }

        /**
         * Gets the value of the 'profileId' field.
         * @return The value.
         */
        public long getProfileId() {
            return profileId;
        }


        /**
         * Sets the value of the 'profileId' field.
         * @param value The value of 'profileId'.
         * @return This builder.
         */
        public com.practicaldime.common.avro.FlashCardAvro.Builder setProfileId(long value) {
            validate(fields()[2], value);
            this.profileId = value;
            fieldSetFlags()[2] = true;
            return this;
        }

        /**
         * Checks whether the 'profileId' field has been set.
         * @return True if the 'profileId' field has been set, false otherwise.
         */
        public boolean hasProfileId() {
            return fieldSetFlags()[2];
        }


        /**
         * Clears the value of the 'profileId' field.
         * @return This builder.
         */
        public com.practicaldime.common.avro.FlashCardAvro.Builder clearProfileId() {
            fieldSetFlags()[2] = false;
            return this;
        }

        /**
         * Gets the value of the 'team' field.
         * @return The value.
         */
        public java.lang.CharSequence getTeam() {
            return team;
        }


        /**
         * Sets the value of the 'team' field.
         * @param value The value of 'team'.
         * @return This builder.
         */
        public com.practicaldime.common.avro.FlashCardAvro.Builder setTeam(java.lang.CharSequence value) {
            validate(fields()[3], value);
            this.team = value;
            fieldSetFlags()[3] = true;
            return this;
        }

        /**
         * Checks whether the 'team' field has been set.
         * @return True if the 'team' field has been set, false otherwise.
         */
        public boolean hasTeam() {
            return fieldSetFlags()[3];
        }


        /**
         * Clears the value of the 'team' field.
         * @return This builder.
         */
        public com.practicaldime.common.avro.FlashCardAvro.Builder clearTeam() {
            team = null;
            fieldSetFlags()[3] = false;
            return this;
        }

        /**
         * Gets the value of the 'player' field.
         * @return The value.
         */
        public java.lang.CharSequence getPlayer() {
            return player;
        }


        /**
         * Sets the value of the 'player' field.
         * @param value The value of 'player'.
         * @return This builder.
         */
        public com.practicaldime.common.avro.FlashCardAvro.Builder setPlayer(java.lang.CharSequence value) {
            validate(fields()[4], value);
            this.player = value;
            fieldSetFlags()[4] = true;
            return this;
        }

        /**
         * Checks whether the 'player' field has been set.
         * @return True if the 'player' field has been set, false otherwise.
         */
        public boolean hasPlayer() {
            return fieldSetFlags()[4];
        }


        /**
         * Clears the value of the 'player' field.
         * @return This builder.
         */
        public com.practicaldime.common.avro.FlashCardAvro.Builder clearPlayer() {
            player = null;
            fieldSetFlags()[4] = false;
            return this;
        }

        /**
         * Gets the value of the 'topic' field.
         * @return The value.
         */
        public java.lang.CharSequence getTopic() {
            return topic;
        }


        /**
         * Sets the value of the 'topic' field.
         * @param value The value of 'topic'.
         * @return This builder.
         */
        public com.practicaldime.common.avro.FlashCardAvro.Builder setTopic(java.lang.CharSequence value) {
            validate(fields()[5], value);
            this.topic = value;
            fieldSetFlags()[5] = true;
            return this;
        }

        /**
         * Checks whether the 'topic' field has been set.
         * @return True if the 'topic' field has been set, false otherwise.
         */
        public boolean hasTopic() {
            return fieldSetFlags()[5];
        }


        /**
         * Clears the value of the 'topic' field.
         * @return This builder.
         */
        public com.practicaldime.common.avro.FlashCardAvro.Builder clearTopic() {
            topic = null;
            fieldSetFlags()[5] = false;
            return this;
        }

        /**
         * Gets the value of the 'pick' field.
         * @return The value.
         */
        public java.lang.CharSequence getPick() {
            return pick;
        }


        /**
         * Sets the value of the 'pick' field.
         * @param value The value of 'pick'.
         * @return This builder.
         */
        public com.practicaldime.common.avro.FlashCardAvro.Builder setPick(java.lang.CharSequence value) {
            validate(fields()[6], value);
            this.pick = value;
            fieldSetFlags()[6] = true;
            return this;
        }

        /**
         * Checks whether the 'pick' field has been set.
         * @return True if the 'pick' field has been set, false otherwise.
         */
        public boolean hasPick() {
            return fieldSetFlags()[6];
        }


        /**
         * Clears the value of the 'pick' field.
         * @return This builder.
         */
        public com.practicaldime.common.avro.FlashCardAvro.Builder clearPick() {
            pick = null;
            fieldSetFlags()[6] = false;
            return this;
        }

        /**
         * Gets the value of the 'submitTime' field.
         * @return The value.
         */
        public java.lang.CharSequence getSubmitTime() {
            return submitTime;
        }


        /**
         * Sets the value of the 'submitTime' field.
         * @param value The value of 'submitTime'.
         * @return This builder.
         */
        public com.practicaldime.common.avro.FlashCardAvro.Builder setSubmitTime(java.lang.CharSequence value) {
            validate(fields()[7], value);
            this.submitTime = value;
            fieldSetFlags()[7] = true;
            return this;
        }

        /**
         * Checks whether the 'submitTime' field has been set.
         * @return True if the 'submitTime' field has been set, false otherwise.
         */
        public boolean hasSubmitTime() {
            return fieldSetFlags()[7];
        }


        /**
         * Clears the value of the 'submitTime' field.
         * @return This builder.
         */
        public com.practicaldime.common.avro.FlashCardAvro.Builder clearSubmitTime() {
            submitTime = null;
            fieldSetFlags()[7] = false;
            return this;
        }

        @Override
        @SuppressWarnings("unchecked")
        public FlashCardAvro build() {
            try {
                FlashCardAvro record = new FlashCardAvro();
                record.refId = fieldSetFlags()[0] ? this.refId : (java.lang.Long) defaultValue(fields()[0]);
                record.teamId = fieldSetFlags()[1] ? this.teamId : (java.lang.Long) defaultValue(fields()[1]);
                record.profileId = fieldSetFlags()[2] ? this.profileId : (java.lang.Long) defaultValue(fields()[2]);
                record.team = fieldSetFlags()[3] ? this.team : (java.lang.CharSequence) defaultValue(fields()[3]);
                record.player = fieldSetFlags()[4] ? this.player : (java.lang.CharSequence) defaultValue(fields()[4]);
                record.topic = fieldSetFlags()[5] ? this.topic : (java.lang.CharSequence) defaultValue(fields()[5]);
                record.pick = fieldSetFlags()[6] ? this.pick : (java.lang.CharSequence) defaultValue(fields()[6]);
                record.submitTime = fieldSetFlags()[7] ? this.submitTime : (java.lang.CharSequence) defaultValue(fields()[7]);
                return record;
            } catch (org.apache.avro.AvroMissingFieldException e) {
                throw e;
            } catch (java.lang.Exception e) {
                throw new org.apache.avro.AvroRuntimeException(e);
            }
        }
    }
}











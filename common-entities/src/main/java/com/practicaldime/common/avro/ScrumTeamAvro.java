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
public class ScrumTeamAvro extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
    public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ScrumTeamAvro\",\"namespace\":\"com.practicaldime.common.avro\",\"fields\":[{\"name\":\"id\",\"type\":\"long\"},{\"name\":\"title\",\"type\":\"string\"},{\"name\":\"organizer\",\"type\":\"string\"},{\"name\":\"locked\",\"type\":\"boolean\",\"default\":false},{\"name\":\"address\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"LocationAvro\",\"fields\":[{\"name\":\"id\",\"type\":[\"long\",\"null\"]},{\"name\":\"city\",\"type\":\"string\"},{\"name\":\"county\",\"type\":[\"string\",\"null\"]},{\"name\":\"state\",\"type\":\"string\"},{\"name\":\"zip\",\"type\":[\"string\",\"null\"]},{\"name\":\"country\",\"type\":[\"string\",\"null\"]},{\"name\":\"createdBy\",\"type\":[\"string\",\"null\"]},{\"name\":\"createdTs\",\"type\":[\"string\",\"null\"]}]}]},{\"name\":\"createdBy\",\"type\":[\"long\",\"null\"]},{\"name\":\"dateCreated\",\"type\":\"string\"},{\"name\":\"picks\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"string\"}]}]}");
    private static final long serialVersionUID = -3862171342038534701L;
    private static SpecificData MODEL$ = new SpecificData();
    private static final BinaryMessageEncoder<ScrumTeamAvro> ENCODER =
            new BinaryMessageEncoder<ScrumTeamAvro>(MODEL$, SCHEMA$);
    private static final BinaryMessageDecoder<ScrumTeamAvro> DECODER =
            new BinaryMessageDecoder<ScrumTeamAvro>(MODEL$, SCHEMA$);
    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumWriter<ScrumTeamAvro>
            WRITER$ = (org.apache.avro.io.DatumWriter<ScrumTeamAvro>) MODEL$.createDatumWriter(SCHEMA$);
    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumReader<ScrumTeamAvro>
            READER$ = (org.apache.avro.io.DatumReader<ScrumTeamAvro>) MODEL$.createDatumReader(SCHEMA$);
    @Deprecated
    public long id;
    @Deprecated
    public java.lang.CharSequence title;
    @Deprecated
    public java.lang.CharSequence organizer;
    @Deprecated
    public boolean locked;
    @Deprecated
    public com.practicaldime.common.avro.LocationAvro address;
    @Deprecated
    public java.lang.Long createdBy;
    @Deprecated
    public java.lang.CharSequence dateCreated;
    @Deprecated
    public java.util.List<java.lang.CharSequence> picks;
    /**
     * Default constructor.  Note that this does not initialize fields
     * to their default values from the schema.  If that is desired then
     * one should use <code>newBuilder()</code>.
     */
    public ScrumTeamAvro() {
    }
    /**
     * All-args constructor.
     * @param id The new value for id
     * @param title The new value for title
     * @param organizer The new value for organizer
     * @param locked The new value for locked
     * @param address The new value for address
     * @param createdBy The new value for createdBy
     * @param dateCreated The new value for dateCreated
     * @param picks The new value for picks
     */
    public ScrumTeamAvro(java.lang.Long id, java.lang.CharSequence title, java.lang.CharSequence organizer, java.lang.Boolean locked, com.practicaldime.common.avro.LocationAvro address, java.lang.Long createdBy, java.lang.CharSequence dateCreated, java.util.List<java.lang.CharSequence> picks) {
        this.id = id;
        this.title = title;
        this.organizer = organizer;
        this.locked = locked;
        this.address = address;
        this.createdBy = createdBy;
        this.dateCreated = dateCreated;
        this.picks = picks;
    }

    public static org.apache.avro.Schema getClassSchema() {
        return SCHEMA$;
    }

    /**
     * Return the BinaryMessageEncoder instance used by this class.
     * @return the message encoder used by this class
     */
    public static BinaryMessageEncoder<ScrumTeamAvro> getEncoder() {
        return ENCODER;
    }

    /**
     * Return the BinaryMessageDecoder instance used by this class.
     * @return the message decoder used by this class
     */
    public static BinaryMessageDecoder<ScrumTeamAvro> getDecoder() {
        return DECODER;
    }

    /**
     * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
     * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
     * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
     */
    public static BinaryMessageDecoder<ScrumTeamAvro> createDecoder(SchemaStore resolver) {
        return new BinaryMessageDecoder<ScrumTeamAvro>(MODEL$, SCHEMA$, resolver);
    }

    /**
     * Deserializes a ScrumTeamAvro from a ByteBuffer.
     * @param b a byte buffer holding serialized data for an instance of this class
     * @return a ScrumTeamAvro instance decoded from the given buffer
     * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
     */
    public static ScrumTeamAvro fromByteBuffer(
            java.nio.ByteBuffer b) throws java.io.IOException {
        return DECODER.decode(b);
    }

    /**
     * Creates a new ScrumTeamAvro RecordBuilder.
     * @return A new ScrumTeamAvro RecordBuilder
     */
    public static com.practicaldime.common.avro.ScrumTeamAvro.Builder newBuilder() {
        return new com.practicaldime.common.avro.ScrumTeamAvro.Builder();
    }

    /**
     * Creates a new ScrumTeamAvro RecordBuilder by copying an existing Builder.
     * @param other The existing builder to copy.
     * @return A new ScrumTeamAvro RecordBuilder
     */
    public static com.practicaldime.common.avro.ScrumTeamAvro.Builder newBuilder(com.practicaldime.common.avro.ScrumTeamAvro.Builder other) {
        if (other == null) {
            return new com.practicaldime.common.avro.ScrumTeamAvro.Builder();
        } else {
            return new com.practicaldime.common.avro.ScrumTeamAvro.Builder(other);
        }
    }

    /**
     * Creates a new ScrumTeamAvro RecordBuilder by copying an existing ScrumTeamAvro instance.
     * @param other The existing instance to copy.
     * @return A new ScrumTeamAvro RecordBuilder
     */
    public static com.practicaldime.common.avro.ScrumTeamAvro.Builder newBuilder(com.practicaldime.common.avro.ScrumTeamAvro other) {
        if (other == null) {
            return new com.practicaldime.common.avro.ScrumTeamAvro.Builder();
        } else {
            return new com.practicaldime.common.avro.ScrumTeamAvro.Builder(other);
        }
    }

    /**
     * Serializes this ScrumTeamAvro to a ByteBuffer.
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
                return id;
            case 1:
                return title;
            case 2:
                return organizer;
            case 3:
                return locked;
            case 4:
                return address;
            case 5:
                return createdBy;
            case 6:
                return dateCreated;
            case 7:
                return picks;
            default:
                throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    // Used by DatumReader.  Applications should not call.
    @SuppressWarnings(value = "unchecked")
    public void put(int field$, java.lang.Object value$) {
        switch (field$) {
            case 0:
                id = (java.lang.Long) value$;
                break;
            case 1:
                title = (java.lang.CharSequence) value$;
                break;
            case 2:
                organizer = (java.lang.CharSequence) value$;
                break;
            case 3:
                locked = (java.lang.Boolean) value$;
                break;
            case 4:
                address = (com.practicaldime.common.avro.LocationAvro) value$;
                break;
            case 5:
                createdBy = (java.lang.Long) value$;
                break;
            case 6:
                dateCreated = (java.lang.CharSequence) value$;
                break;
            case 7:
                picks = (java.util.List<java.lang.CharSequence>) value$;
                break;
            default:
                throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    /**
     * Gets the value of the 'id' field.
     * @return The value of the 'id' field.
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the 'id' field.
     * @param value the value to set.
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the 'title' field.
     * @return The value of the 'title' field.
     */
    public java.lang.CharSequence getTitle() {
        return title;
    }

    /**
     * Sets the value of the 'title' field.
     * @param value the value to set.
     */
    public void setTitle(java.lang.CharSequence value) {
        this.title = value;
    }

    /**
     * Gets the value of the 'organizer' field.
     * @return The value of the 'organizer' field.
     */
    public java.lang.CharSequence getOrganizer() {
        return organizer;
    }

    /**
     * Sets the value of the 'organizer' field.
     * @param value the value to set.
     */
    public void setOrganizer(java.lang.CharSequence value) {
        this.organizer = value;
    }

    /**
     * Gets the value of the 'locked' field.
     * @return The value of the 'locked' field.
     */
    public boolean getLocked() {
        return locked;
    }

    /**
     * Sets the value of the 'locked' field.
     * @param value the value to set.
     */
    public void setLocked(boolean value) {
        this.locked = value;
    }

    /**
     * Gets the value of the 'address' field.
     * @return The value of the 'address' field.
     */
    public com.practicaldime.common.avro.LocationAvro getAddress() {
        return address;
    }

    /**
     * Sets the value of the 'address' field.
     * @param value the value to set.
     */
    public void setAddress(com.practicaldime.common.avro.LocationAvro value) {
        this.address = value;
    }

    /**
     * Gets the value of the 'createdBy' field.
     * @return The value of the 'createdBy' field.
     */
    public java.lang.Long getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the 'createdBy' field.
     * @param value the value to set.
     */
    public void setCreatedBy(java.lang.Long value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the 'dateCreated' field.
     * @return The value of the 'dateCreated' field.
     */
    public java.lang.CharSequence getDateCreated() {
        return dateCreated;
    }

    /**
     * Sets the value of the 'dateCreated' field.
     * @param value the value to set.
     */
    public void setDateCreated(java.lang.CharSequence value) {
        this.dateCreated = value;
    }

    /**
     * Gets the value of the 'picks' field.
     * @return The value of the 'picks' field.
     */
    public java.util.List<java.lang.CharSequence> getPicks() {
        return picks;
    }

    /**
     * Sets the value of the 'picks' field.
     * @param value the value to set.
     */
    public void setPicks(java.util.List<java.lang.CharSequence> value) {
        this.picks = value;
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
        out.writeLong(this.id);

        out.writeString(this.title);

        out.writeString(this.organizer);

        out.writeBoolean(this.locked);

        if (this.address == null) {
            out.writeIndex(0);
            out.writeNull();
        } else {
            out.writeIndex(1);
            this.address.customEncode(out);
        }

        if (this.createdBy == null) {
            out.writeIndex(1);
            out.writeNull();
        } else {
            out.writeIndex(0);
            out.writeLong(this.createdBy);
        }

        out.writeString(this.dateCreated);

        if (this.picks == null) {
            out.writeIndex(0);
            out.writeNull();
        } else {
            out.writeIndex(1);
            long size0 = this.picks.size();
            out.writeArrayStart();
            out.setItemCount(size0);
            long actualSize0 = 0;
            for (java.lang.CharSequence e0 : this.picks) {
                actualSize0++;
                out.startItem();
                out.writeString(e0);
            }
            out.writeArrayEnd();
            if (actualSize0 != size0)
                throw new java.util.ConcurrentModificationException("Array-size written was " + size0 + ", but element count was " + actualSize0 + ".");
        }

    }

    @Override
    public void customDecode(org.apache.avro.io.ResolvingDecoder in)
            throws java.io.IOException {
        org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
        if (fieldOrder == null) {
            this.id = in.readLong();

            this.title = in.readString(this.title instanceof Utf8 ? (Utf8) this.title : null);

            this.organizer = in.readString(this.organizer instanceof Utf8 ? (Utf8) this.organizer : null);

            this.locked = in.readBoolean();

            if (in.readIndex() != 1) {
                in.readNull();
                this.address = null;
            } else {
                if (this.address == null) {
                    this.address = new com.practicaldime.common.avro.LocationAvro();
                }
                this.address.customDecode(in);
            }

            if (in.readIndex() != 0) {
                in.readNull();
                this.createdBy = null;
            } else {
                this.createdBy = in.readLong();
            }

            this.dateCreated = in.readString(this.dateCreated instanceof Utf8 ? (Utf8) this.dateCreated : null);

            if (in.readIndex() != 1) {
                in.readNull();
                this.picks = null;
            } else {
                long size0 = in.readArrayStart();
                java.util.List<java.lang.CharSequence> a0 = this.picks;
                if (a0 == null) {
                    a0 = new SpecificData.Array<java.lang.CharSequence>((int) size0, SCHEMA$.getField("picks").schema().getTypes().get(1));
                    this.picks = a0;
                } else a0.clear();
                SpecificData.Array<java.lang.CharSequence> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<java.lang.CharSequence>) a0 : null);
                for (; 0 < size0; size0 = in.arrayNext()) {
                    for (; size0 != 0; size0--) {
                        java.lang.CharSequence e0 = (ga0 != null ? ga0.peek() : null);
                        e0 = in.readString(e0 instanceof Utf8 ? (Utf8) e0 : null);
                        a0.add(e0);
                    }
                }
            }

        } else {
            for (int i = 0; i < 8; i++) {
                switch (fieldOrder[i].pos()) {
                    case 0:
                        this.id = in.readLong();
                        break;

                    case 1:
                        this.title = in.readString(this.title instanceof Utf8 ? (Utf8) this.title : null);
                        break;

                    case 2:
                        this.organizer = in.readString(this.organizer instanceof Utf8 ? (Utf8) this.organizer : null);
                        break;

                    case 3:
                        this.locked = in.readBoolean();
                        break;

                    case 4:
                        if (in.readIndex() != 1) {
                            in.readNull();
                            this.address = null;
                        } else {
                            if (this.address == null) {
                                this.address = new com.practicaldime.common.avro.LocationAvro();
                            }
                            this.address.customDecode(in);
                        }
                        break;

                    case 5:
                        if (in.readIndex() != 0) {
                            in.readNull();
                            this.createdBy = null;
                        } else {
                            this.createdBy = in.readLong();
                        }
                        break;

                    case 6:
                        this.dateCreated = in.readString(this.dateCreated instanceof Utf8 ? (Utf8) this.dateCreated : null);
                        break;

                    case 7:
                        if (in.readIndex() != 1) {
                            in.readNull();
                            this.picks = null;
                        } else {
                            long size0 = in.readArrayStart();
                            java.util.List<java.lang.CharSequence> a0 = this.picks;
                            if (a0 == null) {
                                a0 = new SpecificData.Array<java.lang.CharSequence>((int) size0, SCHEMA$.getField("picks").schema().getTypes().get(1));
                                this.picks = a0;
                            } else a0.clear();
                            SpecificData.Array<java.lang.CharSequence> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<java.lang.CharSequence>) a0 : null);
                            for (; 0 < size0; size0 = in.arrayNext()) {
                                for (; size0 != 0; size0--) {
                                    java.lang.CharSequence e0 = (ga0 != null ? ga0.peek() : null);
                                    e0 = in.readString(e0 instanceof Utf8 ? (Utf8) e0 : null);
                                    a0.add(e0);
                                }
                            }
                        }
                        break;

                    default:
                        throw new java.io.IOException("Corrupt ResolvingDecoder.");
                }
            }
        }
    }

    /**
     * RecordBuilder for ScrumTeamAvro instances.
     */
    public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ScrumTeamAvro>
            implements org.apache.avro.data.RecordBuilder<ScrumTeamAvro> {

        private long id;
        private java.lang.CharSequence title;
        private java.lang.CharSequence organizer;
        private boolean locked;
        private com.practicaldime.common.avro.LocationAvro address;
        private com.practicaldime.common.avro.LocationAvro.Builder addressBuilder;
        private java.lang.Long createdBy;
        private java.lang.CharSequence dateCreated;
        private java.util.List<java.lang.CharSequence> picks;

        /** Creates a new Builder */
        private Builder() {
            super(SCHEMA$);
        }

        /**
         * Creates a Builder by copying an existing Builder.
         * @param other The existing Builder to copy.
         */
        private Builder(com.practicaldime.common.avro.ScrumTeamAvro.Builder other) {
            super(other);
            if (isValidValue(fields()[0], other.id)) {
                this.id = data().deepCopy(fields()[0].schema(), other.id);
                fieldSetFlags()[0] = other.fieldSetFlags()[0];
            }
            if (isValidValue(fields()[1], other.title)) {
                this.title = data().deepCopy(fields()[1].schema(), other.title);
                fieldSetFlags()[1] = other.fieldSetFlags()[1];
            }
            if (isValidValue(fields()[2], other.organizer)) {
                this.organizer = data().deepCopy(fields()[2].schema(), other.organizer);
                fieldSetFlags()[2] = other.fieldSetFlags()[2];
            }
            if (isValidValue(fields()[3], other.locked)) {
                this.locked = data().deepCopy(fields()[3].schema(), other.locked);
                fieldSetFlags()[3] = other.fieldSetFlags()[3];
            }
            if (isValidValue(fields()[4], other.address)) {
                this.address = data().deepCopy(fields()[4].schema(), other.address);
                fieldSetFlags()[4] = other.fieldSetFlags()[4];
            }
            if (other.hasAddressBuilder()) {
                this.addressBuilder = com.practicaldime.common.avro.LocationAvro.newBuilder(other.getAddressBuilder());
            }
            if (isValidValue(fields()[5], other.createdBy)) {
                this.createdBy = data().deepCopy(fields()[5].schema(), other.createdBy);
                fieldSetFlags()[5] = other.fieldSetFlags()[5];
            }
            if (isValidValue(fields()[6], other.dateCreated)) {
                this.dateCreated = data().deepCopy(fields()[6].schema(), other.dateCreated);
                fieldSetFlags()[6] = other.fieldSetFlags()[6];
            }
            if (isValidValue(fields()[7], other.picks)) {
                this.picks = data().deepCopy(fields()[7].schema(), other.picks);
                fieldSetFlags()[7] = other.fieldSetFlags()[7];
            }
        }

        /**
         * Creates a Builder by copying an existing ScrumTeamAvro instance
         * @param other The existing instance to copy.
         */
        private Builder(com.practicaldime.common.avro.ScrumTeamAvro other) {
            super(SCHEMA$);
            if (isValidValue(fields()[0], other.id)) {
                this.id = data().deepCopy(fields()[0].schema(), other.id);
                fieldSetFlags()[0] = true;
            }
            if (isValidValue(fields()[1], other.title)) {
                this.title = data().deepCopy(fields()[1].schema(), other.title);
                fieldSetFlags()[1] = true;
            }
            if (isValidValue(fields()[2], other.organizer)) {
                this.organizer = data().deepCopy(fields()[2].schema(), other.organizer);
                fieldSetFlags()[2] = true;
            }
            if (isValidValue(fields()[3], other.locked)) {
                this.locked = data().deepCopy(fields()[3].schema(), other.locked);
                fieldSetFlags()[3] = true;
            }
            if (isValidValue(fields()[4], other.address)) {
                this.address = data().deepCopy(fields()[4].schema(), other.address);
                fieldSetFlags()[4] = true;
            }
            this.addressBuilder = null;
            if (isValidValue(fields()[5], other.createdBy)) {
                this.createdBy = data().deepCopy(fields()[5].schema(), other.createdBy);
                fieldSetFlags()[5] = true;
            }
            if (isValidValue(fields()[6], other.dateCreated)) {
                this.dateCreated = data().deepCopy(fields()[6].schema(), other.dateCreated);
                fieldSetFlags()[6] = true;
            }
            if (isValidValue(fields()[7], other.picks)) {
                this.picks = data().deepCopy(fields()[7].schema(), other.picks);
                fieldSetFlags()[7] = true;
            }
        }

        /**
         * Gets the value of the 'id' field.
         * @return The value.
         */
        public long getId() {
            return id;
        }


        /**
         * Sets the value of the 'id' field.
         * @param value The value of 'id'.
         * @return This builder.
         */
        public com.practicaldime.common.avro.ScrumTeamAvro.Builder setId(long value) {
            validate(fields()[0], value);
            this.id = value;
            fieldSetFlags()[0] = true;
            return this;
        }

        /**
         * Checks whether the 'id' field has been set.
         * @return True if the 'id' field has been set, false otherwise.
         */
        public boolean hasId() {
            return fieldSetFlags()[0];
        }


        /**
         * Clears the value of the 'id' field.
         * @return This builder.
         */
        public com.practicaldime.common.avro.ScrumTeamAvro.Builder clearId() {
            fieldSetFlags()[0] = false;
            return this;
        }

        /**
         * Gets the value of the 'title' field.
         * @return The value.
         */
        public java.lang.CharSequence getTitle() {
            return title;
        }


        /**
         * Sets the value of the 'title' field.
         * @param value The value of 'title'.
         * @return This builder.
         */
        public com.practicaldime.common.avro.ScrumTeamAvro.Builder setTitle(java.lang.CharSequence value) {
            validate(fields()[1], value);
            this.title = value;
            fieldSetFlags()[1] = true;
            return this;
        }

        /**
         * Checks whether the 'title' field has been set.
         * @return True if the 'title' field has been set, false otherwise.
         */
        public boolean hasTitle() {
            return fieldSetFlags()[1];
        }


        /**
         * Clears the value of the 'title' field.
         * @return This builder.
         */
        public com.practicaldime.common.avro.ScrumTeamAvro.Builder clearTitle() {
            title = null;
            fieldSetFlags()[1] = false;
            return this;
        }

        /**
         * Gets the value of the 'organizer' field.
         * @return The value.
         */
        public java.lang.CharSequence getOrganizer() {
            return organizer;
        }


        /**
         * Sets the value of the 'organizer' field.
         * @param value The value of 'organizer'.
         * @return This builder.
         */
        public com.practicaldime.common.avro.ScrumTeamAvro.Builder setOrganizer(java.lang.CharSequence value) {
            validate(fields()[2], value);
            this.organizer = value;
            fieldSetFlags()[2] = true;
            return this;
        }

        /**
         * Checks whether the 'organizer' field has been set.
         * @return True if the 'organizer' field has been set, false otherwise.
         */
        public boolean hasOrganizer() {
            return fieldSetFlags()[2];
        }


        /**
         * Clears the value of the 'organizer' field.
         * @return This builder.
         */
        public com.practicaldime.common.avro.ScrumTeamAvro.Builder clearOrganizer() {
            organizer = null;
            fieldSetFlags()[2] = false;
            return this;
        }

        /**
         * Gets the value of the 'locked' field.
         * @return The value.
         */
        public boolean getLocked() {
            return locked;
        }


        /**
         * Sets the value of the 'locked' field.
         * @param value The value of 'locked'.
         * @return This builder.
         */
        public com.practicaldime.common.avro.ScrumTeamAvro.Builder setLocked(boolean value) {
            validate(fields()[3], value);
            this.locked = value;
            fieldSetFlags()[3] = true;
            return this;
        }

        /**
         * Checks whether the 'locked' field has been set.
         * @return True if the 'locked' field has been set, false otherwise.
         */
        public boolean hasLocked() {
            return fieldSetFlags()[3];
        }


        /**
         * Clears the value of the 'locked' field.
         * @return This builder.
         */
        public com.practicaldime.common.avro.ScrumTeamAvro.Builder clearLocked() {
            fieldSetFlags()[3] = false;
            return this;
        }

        /**
         * Gets the value of the 'address' field.
         * @return The value.
         */
        public com.practicaldime.common.avro.LocationAvro getAddress() {
            return address;
        }


        /**
         * Sets the value of the 'address' field.
         * @param value The value of 'address'.
         * @return This builder.
         */
        public com.practicaldime.common.avro.ScrumTeamAvro.Builder setAddress(com.practicaldime.common.avro.LocationAvro value) {
            validate(fields()[4], value);
            this.addressBuilder = null;
            this.address = value;
            fieldSetFlags()[4] = true;
            return this;
        }

        /**
         * Checks whether the 'address' field has been set.
         * @return True if the 'address' field has been set, false otherwise.
         */
        public boolean hasAddress() {
            return fieldSetFlags()[4];
        }

        /**
         * Gets the Builder instance for the 'address' field and creates one if it doesn't exist yet.
         * @return This builder.
         */
        public com.practicaldime.common.avro.LocationAvro.Builder getAddressBuilder() {
            if (addressBuilder == null) {
                if (hasAddress()) {
                    setAddressBuilder(com.practicaldime.common.avro.LocationAvro.newBuilder(address));
                } else {
                    setAddressBuilder(com.practicaldime.common.avro.LocationAvro.newBuilder());
                }
            }
            return addressBuilder;
        }

        /**
         * Sets the Builder instance for the 'address' field
         * @param value The builder instance that must be set.
         * @return This builder.
         */
        public com.practicaldime.common.avro.ScrumTeamAvro.Builder setAddressBuilder(com.practicaldime.common.avro.LocationAvro.Builder value) {
            clearAddress();
            addressBuilder = value;
            return this;
        }

        /**
         * Checks whether the 'address' field has an active Builder instance
         * @return True if the 'address' field has an active Builder instance
         */
        public boolean hasAddressBuilder() {
            return addressBuilder != null;
        }

        /**
         * Clears the value of the 'address' field.
         * @return This builder.
         */
        public com.practicaldime.common.avro.ScrumTeamAvro.Builder clearAddress() {
            address = null;
            addressBuilder = null;
            fieldSetFlags()[4] = false;
            return this;
        }

        /**
         * Gets the value of the 'createdBy' field.
         * @return The value.
         */
        public java.lang.Long getCreatedBy() {
            return createdBy;
        }


        /**
         * Sets the value of the 'createdBy' field.
         * @param value The value of 'createdBy'.
         * @return This builder.
         */
        public com.practicaldime.common.avro.ScrumTeamAvro.Builder setCreatedBy(java.lang.Long value) {
            validate(fields()[5], value);
            this.createdBy = value;
            fieldSetFlags()[5] = true;
            return this;
        }

        /**
         * Checks whether the 'createdBy' field has been set.
         * @return True if the 'createdBy' field has been set, false otherwise.
         */
        public boolean hasCreatedBy() {
            return fieldSetFlags()[5];
        }


        /**
         * Clears the value of the 'createdBy' field.
         * @return This builder.
         */
        public com.practicaldime.common.avro.ScrumTeamAvro.Builder clearCreatedBy() {
            createdBy = null;
            fieldSetFlags()[5] = false;
            return this;
        }

        /**
         * Gets the value of the 'dateCreated' field.
         * @return The value.
         */
        public java.lang.CharSequence getDateCreated() {
            return dateCreated;
        }


        /**
         * Sets the value of the 'dateCreated' field.
         * @param value The value of 'dateCreated'.
         * @return This builder.
         */
        public com.practicaldime.common.avro.ScrumTeamAvro.Builder setDateCreated(java.lang.CharSequence value) {
            validate(fields()[6], value);
            this.dateCreated = value;
            fieldSetFlags()[6] = true;
            return this;
        }

        /**
         * Checks whether the 'dateCreated' field has been set.
         * @return True if the 'dateCreated' field has been set, false otherwise.
         */
        public boolean hasDateCreated() {
            return fieldSetFlags()[6];
        }


        /**
         * Clears the value of the 'dateCreated' field.
         * @return This builder.
         */
        public com.practicaldime.common.avro.ScrumTeamAvro.Builder clearDateCreated() {
            dateCreated = null;
            fieldSetFlags()[6] = false;
            return this;
        }

        /**
         * Gets the value of the 'picks' field.
         * @return The value.
         */
        public java.util.List<java.lang.CharSequence> getPicks() {
            return picks;
        }


        /**
         * Sets the value of the 'picks' field.
         * @param value The value of 'picks'.
         * @return This builder.
         */
        public com.practicaldime.common.avro.ScrumTeamAvro.Builder setPicks(java.util.List<java.lang.CharSequence> value) {
            validate(fields()[7], value);
            this.picks = value;
            fieldSetFlags()[7] = true;
            return this;
        }

        /**
         * Checks whether the 'picks' field has been set.
         * @return True if the 'picks' field has been set, false otherwise.
         */
        public boolean hasPicks() {
            return fieldSetFlags()[7];
        }


        /**
         * Clears the value of the 'picks' field.
         * @return This builder.
         */
        public com.practicaldime.common.avro.ScrumTeamAvro.Builder clearPicks() {
            picks = null;
            fieldSetFlags()[7] = false;
            return this;
        }

        @Override
        @SuppressWarnings("unchecked")
        public ScrumTeamAvro build() {
            try {
                ScrumTeamAvro record = new ScrumTeamAvro();
                record.id = fieldSetFlags()[0] ? this.id : (java.lang.Long) defaultValue(fields()[0]);
                record.title = fieldSetFlags()[1] ? this.title : (java.lang.CharSequence) defaultValue(fields()[1]);
                record.organizer = fieldSetFlags()[2] ? this.organizer : (java.lang.CharSequence) defaultValue(fields()[2]);
                record.locked = fieldSetFlags()[3] ? this.locked : (java.lang.Boolean) defaultValue(fields()[3]);
                if (addressBuilder != null) {
                    try {
                        record.address = this.addressBuilder.build();
                    } catch (org.apache.avro.AvroMissingFieldException e) {
                        e.addParentField(record.getSchema().getField("address"));
                        throw e;
                    }
                } else {
                    record.address = fieldSetFlags()[4] ? this.address : (com.practicaldime.common.avro.LocationAvro) defaultValue(fields()[4]);
                }
                record.createdBy = fieldSetFlags()[5] ? this.createdBy : (java.lang.Long) defaultValue(fields()[5]);
                record.dateCreated = fieldSetFlags()[6] ? this.dateCreated : (java.lang.CharSequence) defaultValue(fields()[6]);
                record.picks = fieldSetFlags()[7] ? this.picks : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[7]);
                return record;
            } catch (org.apache.avro.AvroMissingFieldException e) {
                throw e;
            } catch (java.lang.Exception e) {
                throw new org.apache.avro.AvroRuntimeException(e);
            }
        }
    }
}











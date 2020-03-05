package com.practicaldime.common.convert;

import com.practicaldime.common.avro.*;
import com.practicaldime.common.entity.scrum.FlashCard;
import com.practicaldime.common.entity.scrum.ScrumTeam;
import com.practicaldime.common.entity.users.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class AvroEntity {

    public static final Logger LOG = LoggerFactory.getLogger(AvroEntity.class);
    public static final DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static CharSequence dateToStr(Date date) {
        return sdf.format(date);
    }

    public static Date strToDate(String date) {
        try {
            if (date != null && date.trim().length() > 0) {
                return sdf.parse(date);
            }
        } catch (ParseException | NullPointerException e) {
            LOG.error("could not parse date string into valid date, {}", date);
        }
        return null;
    }

    public static LocationAvro convert(Location address) {
        return LocationAvro.newBuilder()
                .setCity(address.getCity())
                .setCountry(address.getCountry())
                .setCounty(address.getCounty())
                .setState(address.getState())
                .setZip(address.getZip())
                .setCreatedTs(dateToStr(address.getCreatedTs()))
                .setId(address.getId()).build();
    }

    public static Location convert(LocationAvro address) {
        return new Location(
                address.getId(),
                address.getCity().toString(),
                address.getCounty().toString(),
                address.getState().toString(),
                address.getZip().toString(),
                address.getCountry().toString(),
                strToDate(address.getCreatedTs().toString())
        );
    }

    public static ProfileAvro convert(Profile profile) {
        return ProfileAvro.newBuilder()
                .setId(profile.getId())
                .setFirstName(profile.getFirstName())
                .setLastName(profile.getLastName())
                .setEmailAddress(profile.getEmailAddress())
                .setEmailVerified(profile.getEmailVerified())
                .setPhoneNumber(profile.getPhoneNumber())
                .setPhoneVerified(profile.getPhoneVerified())
                .setAddress(convert(profile.getLocatedAt()))
                .setUpdatedBy(profile.getUpdatedBy())
                .setCreatedTs(dateToStr(profile.getCreatedTs())).build();
    }

    public static Profile convert(ProfileAvro profile) {
        return new Profile(
                profile.getId(),
                profile.getFirstName().toString(),
                profile.getLastName().toString(),
                profile.getEmailAddress().toString(),
                profile.getEmailVerified(),
                profile.getPhoneNumber().toString(),
                profile.getPhoneVerified(),
                convert(profile.getAddress()),
                profile.getUpdatedBy(),
                strToDate(profile.getCreatedTs().toString())
        );
    }

    public static AccountAvro convert(Account account) {
        return AccountAvro.newBuilder()
                .setCreatedTs(dateToStr(account.getCreatedTs()))
                .setId(account.getId())
                .setPassword(new String(account.getPassword()))
                .setUsername(account.getUsername())
                .setRole(AccRoleAvro.valueOf(account.getRole().name()))
                .setStatus(AccStatusAvro.valueOf(account.getStatus().name()))
                .setUpdatedBy(account.getUpdatedBy())
                .setProfile(convert(account.getProfile())).build();
    }

    public static Account convert(AccountAvro account) {
        return new Account(
                account.getId(),
                account.getUsername().toString(),
                account.getPassword().toString().toCharArray(),
                AccRole.valueOf(account.getRole().toString()),
                AccStatus.valueOf(account.getStatus().toString()),
                convert(account.getProfile()),
                account.getUpdatedBy(),
                strToDate(account.getCreatedTs().toString())
        );
    }

    public static FlashCardAvro convert(FlashCard card) {
        return FlashCardAvro.newBuilder()
                .setRefId(card.getRefId())
                .setTeamId(card.getTeamId())
                .setProfileId(card.getProfileId())
                .setPick(card.getPick())
                .setTopic(card.getTopic())
                .setPlayer(card.getPlayer())
                .setTeam(card.getTeam())
                .setSubmitTime(dateToStr(card.getSubmitTime())).build();
    }

    public static FlashCard convert(FlashCardAvro card) {
        return new FlashCard(
                card.getRefId(),
                card.getTeamId(),
                card.getProfileId(),
                card.getTeam().toString(),
                card.getPlayer().toString(),
                card.getTopic().toString(),
                card.getPick().toString(),
                strToDate(card.getSubmitTime().toString())
        );
    }

    public static ScrumTeamAvro convert(ScrumTeam team) {
        return ScrumTeamAvro.newBuilder()
                .setId(team.getId())
                .setTitle(team.getTitle())
                .setOrganizer(team.getOrganizer())
                .setLocked(team.getLocked())
                .setPicks(Arrays.asList(team.getPicks()))
                .setCreatedBy(team.getCreatedBy())
                .setCreatedTs(dateToStr((team.getCreatedTs())))
                .setAddress(convert(team.getLocatedAt())).build();
    }

    public static ScrumTeam convert(ScrumTeamAvro team) {
        return new ScrumTeam(
                team.getId(),
                team.getTitle().toString(),
                team.getOrganizer().toString(),
                team.getLocked(),
                convert(team.getAddress()),
                team.getCreatedBy(),
                strToDate(team.getCreatedTs().toString()),
                team.getPicks().toArray(new String[team.getPicks().size()])
        );
    }
}

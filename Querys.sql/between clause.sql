mysql> use somaliapdb1;
Database changed
mysql> select * from mytable where Date between '2020-08-10' and '';
Empty set, 8783 warnings (0.12 sec)

mysql> select * from mytable where Date between '2020-08-10' and '2020-08-13';
+-----+---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+------------+----------------+--------+---------+---------------------+-------------+-------------------+------------------------+---------------------+-----------------+----------------------------------+---------------------+-------------------+------------------------------+------------------------------+---------------------+-------------------------------+------------------+------------------+--------------------+----------------------+-------------+--------------+-------------+--------+----------------------------------+--------------+------------------+---------+
| id  | Summary





                                                                            | Date       | Estimated_Time | Killed | Injured | Number_of_Incidents | High_Impact | SourceInfo_Rating | Location_Accuracy      | Longitude           | Province        | Location
               | Activity_Type       | Incident_Type     | Incident_SubType             | SubType1                     | Target              | SubType2                      | Criminal_Charges | Physical_Context | Reason_for_Protest | Number_of_Protesters | PMU_Faction | Tribal_Group | Major_Storm | Tactic | Unusual_Social_Political_Tension | Threat_Level | Disease_Outbreak | Drought |
+-----+---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+------------+----------------+--------+---------+---------------------+-------------+-------------------+------------------------+---------------------+-----------------+----------------------------------+---------------------+-------------------+------------------------------+------------------------------+---------------------+-------------------------------+------------------+------------------+--------------------+----------------------+-------------+--------------+-------------+--------+----------------------------------+--------------+------------------+---------+
|   1 | Somali security forces on 10 August shot dead at least 15 armed inmates at Mogadishu Central Prison.  Four prison guards were also killed in clashes at the facility by the armed inmates, the majority of whom were al Shabaab members.  A former NISA officer serving a life sentence for passing information to AS was among the dead.  Two inmates involved in the clashes were injured and apprehended, while another inmate and AS member escaped the prison.   At least 5 other people were also injured in the incident.  The weapons were smuggled into the prison by visitors who are allowed to visit twice a week; the incident began during a shift change of prison guards.  AS continues to be able to infiltrate nearly any location in Mogadishu, including even the heavily guarded Central Prison, and may have had other "insider" support in order to carry out this attack. | 2020-08-10 | 0600-1159      |     19 |       7 |                   1 | Yes         | Reliable          | Neighborhood / Village | 2.027225, 45.334690 | Banadir         | Mogadishu Central Prison         | Terrorism           | Small_Arms_Fire   | Gun Battle                   | Al-Shabaab*                  | Security_Forces     | Somali National Army (SNA)*   | NULL             | NULL             | NULL               | NULL                 | NULL        | NULL         | NULL        | NULL   | NULL                             | NULL         | NULL             | NULL    |
|   2 | An al Shabaab inmate, later identified as Mubarak Ibrahim Idle on 10 August at Mogadishu Central Prison escaped the facility, murdering a rickshaw driver and one other civilian.  Mubarak had been part of a larger escape attempt from the prison that left at least 7 other people dead but was the only prisoner to successfully escape.  He had in 2014 been sentenced to 10 years in prison for belonging to AS.


                                                                            | 2020-08-10 | 0600-1159      |      2 |       0 |                   1 | No          | Reliable          | Neighborhood / Village | 2.027225, 45.334690 | Banadir         | Mogadishu Central Prison         | Crime               | Small_Arms_Fire   | SAF Targeted Shooting        | Al-Shabaab*                  | Local_Civilian      | Civilian / Shop               | NULL             | NULL             | NULL               | NULL                 | NULL        | NULL         | NULL        | NULL   | NULL                             | NULL         | NULL             | NULL    |
|   3 | Security forces on 10 August carried out a controlled detonation of a grenade that had been smuggled into Mogadishu Central Prison.  This followed clashes between armed inmates and prison security guards that left at least 18 dead.




                                                                            | 2020-08-10 | 1200-1759      |      0 |       0 |                   1 | No          | Reliable          | Neighborhood / Village | 2.027225, 45.334690 | Banadir         | Mogadishu Central Prison         | Military Operations | IED_Cleared       | Cleared Roadside/Planted IED | Somali National Army (SNA) * | Terrorist           | Al-Shabaab*                   | NULL             | NULL             | NULL               | NULL                 | NULL        | NULL         | NULL        | NULL   | NULL                             | NULL         | NULL             | NULL    |
|   6 | An AMSIOM armored vehicle on 10 August was reported to have run over a tuk tuk in the Hodan District near the Ex Digfeer Hospital, killing one person.  These incidents sometimes trigger civil unrest in the city against AMISOM forces.




                                                                            | 2020-08-10 | 0600-1159      |      1 |       0 |                   1 | No          | Reliable          | Neighborhood / Village | 2.043012, 45.304360 | Banadir         | Road near Ex Digfeer Hospital    | Hazard              | Hazard            | Major RTA                    | AMISOM                       | Local_Civilian      | Civilian / Shop               | NULL             | NULL             | NULL               | NULL                 | NULL        | NULL         | NULL        | NULL   | NULL                             | NULL         | NULL             | NULL    |
|   8 | Hirshabelle's State Security Minister on 10 August said that SNA operations in Lower Shabelle have recently forced many al Shabaab fighters to flee into the Middle Shabelle area, causing insecurity on the road between Mogadishu and Jowhar as AS members now carry out attacks in the area.


                                                                            | 2020-08-10 | NA / Unknown   |      0 |       0 |                   1 | No          | Reliable          | County / District      | 2.509509, 45.372713 | Middle Shabelle | Mogadishu-Jowhar Road            | Hazard              | Warning           | Kinetic Threat               | Al-Shabaab*                  | Security_Forces     | Hirshabelle Security Forces * | NULL             | NULL             | NULL               | NULL                 | NULL        | NULL         | NULL        | NULL   | NULL                             | NULL         | NULL             | NULL    |
|   9 | Puntland security forces arrested 8 members of a drug and alcohol dealing gang after clashes with armed gang members in Galkayo on 09 August.  Weapons were also seized in the operation.  In these clashes, two soldiers, including the head of the Puntland Presidential Guard, were killed.



                                                                            | 2020-08-10 | 0600-1159      |      0 |       0 |                   1 | No          | Reliable          | City / Town            | 6.781684, 47.432484 | Mudug           | Galkayo
               | Military Operations | Security_Response | Arrest                       | Puntland Security Forces *   | Criminal            | Violent Criminal              | NULL             | NULL             | NULL               | NULL                 | NULL        | NULL         | NULL        | NULL   | NULL                             | NULL         | NULL             | NULL    |
|  11 | Unconfirmed reports on 10 August indicated that Danab forces had abducted an elderly man from Ceel Biyood in Wanlaweyn District and had executed him in a nearby forest.  A source said that locals believed Danab forces based at Balidogle had carried out the extrajudicial killing.



                                                                            | 2020-08-11 | 0600-1159      |      1 |       0 |                   1 | No          | Questionable      | Neighborhood / Village | 2.6383,44.8048      | Lower Shabelle  | Ceel Biyood village              | Military Operations | Small_Arms_Fire   | SAF Targeted Shooting        | Danab Forces                 | Local_Civilian      | Civilian / Shop               | NULL             | NULL             | NULL               | NULL                 | NULL        | NULL         | NULL        | NULL   | NULL                             | NULL         | NULL             | NULL    |
|  13 | At least 9 people, including civilians, were killed and 5 others injured when al Shabaab militants launched a multi-pronged attack on Shabelow village, about 20kms east of Ba'adweyne in Mudug Region early on 12 August.  Sources later reported at least 5 AS fighters killed in the clash.  Fighting reportedly began after AS militants demanded locals pay a Zakawat tax and demanded child recruits, leading to clashes between AS and local militia.  SNA and Galgaduud security forces later arrived to help repel AS militants from the area.  Among the dead was a local quaranic schoolteacher.  al Shabaab claimed meanwhile to have captured the town, a military base in the area, and to have killed 9 soldiers in the clashes.
                                                                            | 2020-08-12 | 0000-0559      |     14 |       0 |                   1 | Yes         | Fairly Reliable   | Neighborhood / Village | 5.3706,47.8448      | Mudug           | Shabelow area                    | Terrorism           | Small_Arms_Fire   | Gun Battle                   | Al-Shabaab*                  | Security_Forces     | Clan Militia                  | NULL             | NULL             | NULL               | NULL                 | NULL        | NULL         | NULL        | NULL   | NULL                             | NULL         | NULL             | NULL    |
|  14 | A roadside IED exploded, targeting a vehicle in Mogadishu's Waaberi District on the evening of 12 August, killing one person and injuring another person.  Sources later identified the fatality a national intelligence officer, Colonel Nur.  Al Shabaab later claimed responsibility for this attack.



                                                                            | 2020-08-12 | 1800-2359      |      1 |       1 |                   1 | No          | Fairly Reliable   | Neighborhood / Village | 2.028461, 45.320424 | Banadir         | Waberi District, Mogadishu       | Terrorism           | IED               | Roadside / Planted IED       | Al-Shabaab*                  | Local_Civilian      | Civilian / Shop               | NULL             | NULL             | NULL               | NULL                 | NULL        | NULL         | NULL        | NULL   | NULL                             | NULL         | NULL             | NULL    |
|  15 | Security forces in Galkayo on 12 August destroyed a large quantity of alcohol seized in a recent anti-drug operation in the city.  The head of the Puntland Presidential Guards was recently killed in one such operation after clashes with an armed gang.




                                                                            | 2020-08-12 | 1200-1759      |      0 |       0 |                   1 | No          | Reliable          | City / Town            | 6.7705,47.4300      | Mudug           | Galkayo
               | Crime               | Security_Response | Other Security Operation     | Somali Police                | Criminal            | Criminal Gang                 | NULL             | NULL             | NULL               | NULL                 | NULL        | NULL         | NULL        | NULL   | NULL                             | NULL         | NULL             | NULL    |
|  17 | Somali security forces on 12 August launched a clearing operation in Gedo Region to open roads in the area.  Operations are reportedly ongoing in Luuq, Dolow, and Beledhawo areas.  No further details regarding this operation are currently available, though security forces are likely targeting al Shabaab militants based near major towns and roads.



                                                                            | 2020-08-12 | 0600-1159      |      0 |       0 |                   1 | No          | Fairly Reliable   | County / District      | 3.797664, 42.476234 | Gedo            | Luuq, Dolow, and Beledhawo areas | Military Operations | Security_Response | Other Security Operation     | Somali National Army (SNA) * | Terrorist           | Al-Shabaab*                   | NULL             | NULL             | NULL               | NULL                 | NULL        | NULL         | NULL        | NULL   | NULL                             | NULL         | NULL             | NULL    |
|  18 | Al Shabaab was reported on 13 August in Jilib to have executed Abdifatah Baari, an ex-militia fighter who had fought for warlords in the 1990's before joining al Shabaab.  Baari had been held in detention for months and was one of the group's most veteran members.  One other person accused of spying for the CIA was also executed, sources reported.  The reasons for Baari's execution were not immediately clear, though internal AS disputes are a likely cause.


                                                                            | 2020-08-13 | 0600-1159      |      2 |       0 |                   1 | No          | Fairly Reliable   | City / Town            | 0.4971,42.7756      | Middle Jubba    | Jilib
               | Terrorism           | Small_Arms_Fire   | SAF Targeted Shooting        | Al-Shabaab*                  | Terrorist           | Al-Shabaab*                   | NULL             | NULL             | NULL               | NULL                 | NULL        | NULL         | NULL        | NULL   | NULL                             | NULL         | NULL             | NULL    |
|  19 | Supporters of Mukhtar Robow Abu Mansour peacefully protested his continued imprisonment on 13 August in Baidoa.  Robow, previously al Shabaab's Deputy Commander before defecting from the group, was jailed in December 2018, allegedly to prevent him from running for the leadership of the Southwest State.  Robow retains significant popularity among elements of the Rahaweyn clan.



                                                                            | 2020-08-13 | NA / Unknown   |      0 |       0 |                   1 | No          | Reliable          | City / Town            | 3.1165,43.6507      | Bay             | Baidoa
               | Civil Unrest        | Protest           | March / Picketing            | Civil Activist / Protester   | National_Government | Local Gov                     | NULL             | NULL             | NULL               | NULL                 | NULL        | NULL         | NULL        | NULL   | NULL                             | NULL         | NULL             | NULL    |
|  20 | Somalia's "multi-hazard" center issued flood warnings on 13 August for communities along the Shabelle River, saying flooding was particularly likely in the Beledweyne and Jowhar areas.




                                                                            | 2020-08-13 | 1800-2359      |      0 |       0 |                   1 | No          | Reliable          | County / District      | 4.757038, 45.153140 | Nationwide      | Banks of Shabelle River          | Hazard              | Hazard            | Weather Event                | Weather                      | Local_Civilian      | Civilian / Shop               | NULL             | NULL             | NULL               | NULL                 | NULL        | NULL         | NULL        | NULL   | NULL                             | NULL         | NULL             | NULL    |
|  21 | The US embassy in Mogadishu on 13 August called for "broad based support" from the federal and regional governments, as well as parliament and other stakeholders for timely elections, saying there should be no mandate extensions for the current government.  This comes as talks on the elections, provisionally slated for later this year, were being discussed in Dhusamareb.



                                                                            | 2020-08-13 | 1200-1759      |      0 |       0 |
            1 | No          | Reliable          | Neighborhood / Village | 2.0155,45.3091      | Banadir         | US Embassy, Mogadishu            | Announcement        | Announcement      | Announcement                 | USA                          | National_Government | Federal Gov of Somalia        | NULL             | NULL             | NULL               | NULL                 | NULL        | NULL         | NULL        | NULL   | NULL                             | NULL         | NULL             | NULL    |
|  28 | Clashes were reported just outside Kismayo on 10 August after al Shabaab militants ambushed Jubbland security forces.  No information was available regarding casualties.




                                                                            | 2020-08-10 | 0000-0559      |      0 |       0 |                   1 | No          | Fairly Reliable   | County / District      | -0.3663,42.5051     | Lower Jubba     | Kismayo Outskirts                | Terrorism           | Small_Arms_Fire   | SAF Roadside Ambush          | Al-Shabaab*                  | Security_Forces     | Jubbaland Security Forces *   | NULL             | NULL             | NULL               | NULL                 | NULL        | NULL         | NULL        | NULL   | NULL                             | NULL         | NULL             | NULL    |
|  29 | Galmudug's Vice President on the night of 12 August announced new military operations had been launched to clear al Shabaab from parts of the region.  This came after AS militants launched a large attack west of Hobyo near Ba'adweyn earlier on 12 August.



                                                                            | 2020-08-12 | 1800-2359      |      0 |       0 |                   1 | No          | Reliable          | Provincial             | 5.3554,47.8805      | Mudug           | Ba'adweyn area                   | Military Operations | Security_Response | Other Security Operation     | Galmudug Security Forces *   | Terrorist           | Al-Shabaab*                   | NULL             | NULL             | NULL               | NULL                 | NULL        | NULL         | NULL        | NULL   | NULL                             | NULL         | NULL             | NULL    |
|  30 | Security forces on 13 August were reported to have carried out security operations in Adado District, including searches of vehicles.  No other details regarding this operation are currently available.




                                                                            | 2020-08-13 | 1800-2359      |      0 |       0 |                   1 | No          | Fairly Reliable   | City / Town            | 6.1337,46.6287      | Galguduud       | Adado
               | Crime               | Security_Response | Other Security Operation     | Galmudug Security Forces *   | Criminal            | Nonviolent Criminal           | NULL             | NULL             | NULL               | NULL                 | NULL        | NULL         | NULL        | NULL   | NULL                             | NULL         | NULL             | NULL    |
|  31 | Somaliland police forces conducted an operation in Las Anod in Sool Region on 13 August, seizing illegal weapons and narcotics and arresting several people.  This operation was carried out after a tip off by local residents.



                                                                            | 2020-08-13 | NA / Unknown   |      0 |       0 |                   1 | No          | Fairly Reliable   | City / Town            | 8.4759,47.3608      | Sool            | Las Anod
               | Crime               | Security_Response | Arrest                       | Somaliland Security Forces * | Criminal            | Criminal Gang                 | Drug Crimes      | NULL             | NULL               | NULL                 | NULL        | NULL         | NULL        | NULL   | NULL                             | NULL         | NULL             | NULL    |
|  32 | Three people were killed by a clan militia who attacked the Jidbale area.  One report indicated 6 people had been killed.  This came after a clan dispute over which sub-clan could live in the area.  Intermittent inter-clan fighting continues to occur in the borderlands of Sanaag and Sool Regions.   Clashes later ended sources reported after clan elders travelled to the area for talks.


                                                                            | 2020-08-13 | NA / Unknown   |      3 |       0 |                   1 | No          | Fairly Reliable   | Neighborhood / Village | 9.9763,47.1712      | Sanaag          | Jidbale
               | Military Operations | Small_Arms_Fire   | SAF Village Assault          | Tribal Gang                  | Criminal            | Tribal Gang                   | NULL             | NULL             | NULL               | NULL                 | NULL        | NULL         | NULL        | NULL   | NULL                             | NULL         | NULL             | NULL    |
|  33 | Two clan elders were injured in Xudun District of Sool Region in a road traffic accident.  The two were travelling back from talks to end local clan fighting in the area and are now being treated at a Las Anod hospital.




                                                                            | 2020-08-13 | 1200-1759      |      0 |       2 |                   1 | No          | Fairly Reliable   | County / District      | 9.2621,47.3099      | Sool            | Xudun District                   | Hazard              | Hazard            | Major RTA                    | Accident                     | Local_Civilian      | Clan Leader                   | NULL             | NULL             | NULL               | NULL                 | NULL        | NULL         | NULL        | NULL   | NULL                             | NULL         | NULL             | NULL    |
|  34 | Ex-PM Hassan Ali Khaire on the evening of 12 August was reported to have moved all his possessions from the Villa Somalia to a hotel near Mogadishu International Airport.  Security forces escorted him and temporarily shut down all roads linking the Villa Somalia and the airport.



                                                                            | 2020-08-12 | 1800-2359      |      0 |       0 |                   1 | No          | Fairly Reliable   | Neighborhood / Village | 2.0294,45.3094      | Banadir         | Villa Somalia - MIA roads        | Announcement        | Security_Response | Other Security Operation     | Somali Police                | National_Government | Government Employee           | NULL             | NULL             | NULL               | NULL                 | NULL        | NULL         | NULL        | NULL   | NULL                             | NULL         | NULL             | NULL    |
|  37 | Grenade attacks on the night of 13 August nearly simultaneously targeted 10 Police District HQs throughout Mogadishu.  Al Shabaab is likely responsible for the attack, which resulted in at least 4 injuries.  The Dherkenley District HQ was one of the sites targeted.



                                                                            | 2020-08-13 | 1800-2359      |      0 |       4 |                   1 | Yes         | Fairly Reliable   | Neighborhood / Village | 2.0276,45.2616      | Banadir         | Dherkenley District, Mogadishu   | Terrorism           | Grenade           | Grenade Attack               | Al-Shabaab*                  | Security_Forces     | Somali Police                 | NULL             | NULL             | NULL               | NULL                 | NULL        | NULL         | NULL        | NULL   | NULL                             | NULL         | NULL             | NULL    |
|  38 | Grenade attacks on the night of 13 August nearly simultaneously targeted 10 Police District HQs throughout Mogadishu.  Al Shabaab is likely responsible for the attack, which resulted in at least 4 injuries.  The Wadajir District HQ was one of the sites targeted.



                                                                            | 2020-08-13 | 1800-2359      |      0 |       0 |                   1 | Yes         | Fairly Reliable   | Neighborhood / Village | 2.0228,45.2827      | Banadir         | Wadajir                          | Terrorism           | Grenade           | Grenade Attack               | Al-Shabaab*                  | Security_Forces     | Somali Police                 | NULL             | NULL             | NULL               | NULL                 | NULL        | NULL         | NULL        | NULL   | NULL                             | NULL         | NULL             | NULL    |
|  39 | Grenade attacks on the night of 13 August nearly simultaneously targeted 10 Police District HQs throughout Mogadishu.  Al Shabaab is likely responsible for the attack, which resulted in at least 4 injuries.  The Waberi District HQ was one of the sites targeted.



                                                                            | 2020-08-13 | 1800-2359      |      0 |       0 |                   1 | Yes         | Fairly Reliable   | Neighborhood / Village | 2.0266,45.3196      | Banadir         | Waberi District, Mogadishu       | Terrorism           | Grenade           | Grenade Attack               | Al-Shabaab*                  | Security_Forces     | Somali Police                 | NULL             | NULL             | NULL               | NULL                 | NULL        | NULL         | NULL        | NULL   | NULL                             | NULL         | NULL             | NULL    |
|  40 | Grenade attacks on the night of 13 August nearly simultaneously targeted 10 Police District HQs throughout Mogadishu.  Al Shabaab is likely responsible for the attack, which resulted in at least 4 injuries.  The Karan District HQ was one of the sites targeted.



                                                                            | 2020-08-13 | 1800-2359      |      0 |       0 |                   1 | Yes         | Fairly Reliable   | Neighborhood / Village | 2.0528,45.3668      | Banadir         | Karan
               | Terrorism           | Grenade           | Grenade Attack               | Al-Shabaab*                  | Security_Forces     | Somali Police                 | NULL             | NULL             | NULL               | NULL                 | NULL
   | NULL         | NULL        | NULL   | NULL                             | NULL         | NULL             | NULL    |
|  41 | Grenade attacks on the night of 13 August nearly simultaneously targeted 10 Police District HQs throughout Mogadishu.  Al Shabaab is likely responsible for the attack, which resulted in at least 4 injuries.  The Daynile District HQ was one of the sites targeted.



                                                                            | 2020-08-13 | 1800-2359      |      0 |       0 |                   1 | Yes         | Fairly Reliable   | Neighborhood / Village | 2.0588,45.2807      | Banadir         | Daynile District, Mogadishu      | Terrorism           | Grenade           | Grenade Attack               | Al-Shabaab*                  | Security_Forces     | Somali Police                 | NULL             | NULL             | NULL               | NULL                 | NULL        | NULL         | NULL        | NULL   | NULL                             | NULL         | NULL             | NULL    |
|  42 | Grenade attacks on the night of 13 August nearly simultaneously targeted 10 Police District HQs throughout Mogadishu.  Al Shabaab is likely responsible for the attack, which resulted in at least 4 injuries.  The Shibis District HQ was one of the sites targeted.



                                                                            | 2020-08-13 | 1800-2359      |      0 |       0 |                   1 | Yes         | Fairly Reliable   | Neighborhood / Village | 2.0477,45.3489      | Banadir         | Shibis
               | Terrorism           | Grenade           | Grenade Attack               | Al-Shabaab*                  | Security_Forces     | Somali Police                 | NULL             | NULL             | NULL               | NULL                 | NULL        | NULL         | NULL        | NULL   | NULL                             | NULL         | NULL             | NULL    |
|  43 | Grenade attacks on the night of 13 August nearly simultaneously targeted 10 Police District HQs throughout Mogadishu.  Al Shabaab is likely responsible for the attack, which resulted in at least 4 injuries.  The Boondheere District HQ was one of the sites targeted.


                                                                            | 2020-08-13 | 1800-2359      |      0 |       0 |                   1 | Yes         | Fairly Reliable   | Neighborhood / Village | 2.0461,45.3423      | Banadir         | Boondheere                       | Terrorism           | Grenade           | Grenade Attack               | Al-Shabaab*                  | Security_Forces     | Somali Police                 | NULL             | NULL             | NULL               | NULL                 | NULL        | NULL         | NULL        | NULL   | NULL                             | NULL         | NULL             | NULL    |
|  44 | Grenade attacks on the night of 13 August nearly simultaneously targeted 10 Police District HQs throughout Mogadishu.  Al Shabaab is likely responsible for the attack, which resulted in at least 4 injuries.  The Yaaqshid District HQ was one of the sites targeted.


                                                                            | 2020-08-13 | 1800-2359      |      0 |       0 |                   1 | Yes         | Fairly Reliable   | Neighborhood / Village | 2.0554,45.3444      | Banadir         | Yaaqshid
               | Terrorism           | Grenade           | Grenade Attack               | Al-Shabaab*                  | Security_Forces     | Somali Police                 | NULL             | NULL             | NULL               | NULL                 | NULL        | NULL         | NULL        | NULL   | NULL                             | NULL         | NULL             | NULL    |
|  45 | Grenade attacks on the night of 13 August nearly simultaneously targeted 10 Police District HQs throughout Mogadishu.  Al Shabaab is likely responsible for the attack, which resulted in at least 4 injuries.  The Garasbaaleey District HQ was one of the sites targeted.



                                                                            | 2020-08-13 | 1800-2359      |      0 |       0 |                   1 | Yes         | Fairly Reliable   | Neighborhood / Village | 2.0665,45.3037      | Banadir         | Garasbaaleey                     | Terrorism           | Grenade           | Grenade Attack               | Al-Shabaab*                  | Security_Forces     | Somali Police                 | NULL             | NULL             | NULL               | NULL                 | NULL        | NULL         | NULL        | NULL   | NULL                             | NULL         | NULL             | NULL    |
|  46 | Grenade attacks on the night of 13 August nearly simultaneously targeted 10 Police District HQs throughout Mogadishu.  Al Shabaab is likely responsible for the attack, which resulted in at least 4 injuries.  The Nagele Department in Karan District was one of the sites targeted.



                                                                            | 2020-08-13 | 1800-2359      |      0 |       0 |                   1 | Yes         | Fairly Reliable   | Neighborhood / Village | 2.0228,45.2831      | Banadir         | Wadajir
               | Terrorism           | Grenade           | Grenade Attack               | Al-Shabaab*                  | Security_Forces     | Somali Police                 | NULL             | NULL             | NULL               | NULL                 | NULL        | NULL         | NULL        | NULL   | NULL                             | NULL         | NULL             | NULL    |
|  94 | Security forces detained gang members involved with the robbery of a remittance center in Garowe on 13 August. The armed robbers previously stole 5,000 USD from Iftin Express remittance center last 9 August.




                                                                            | 2020-08-13 | NA / Unknown   |      0 |       0 |                   1 | No          | Reliable          | City / Town            | 8.397488, 48.485005 | Nugal           | Garowe                           | Crime               | Security_Response | Arrest                       | Somali Police                | Criminal            | Violent Criminal              | NULL             | NULL             | NULL               | NULL                 | NULL        | NULL         | NULL        | NULL   | NULL                             | NULL         | NULL             | NULL    |
|  98 | Security forces seized several bags filled with Khat after intercepting a plane bound for Mogadishu at Ugas Nur Airport, southwest of Dhusamareb, on 12 August. Security forces stated that they will burn the seized Khat as part of the federal government ban on Khat.



                                                                            | 2020-08-12 | NA / Unknown   |      0 |       0 |                   1 | No          | Reliable          | Landmark / Coordinates | 5.477737, 46.362451 | Galguduud       | Ugas Nur Airport, Dhusamareb     | Crime               | Smuggling         | Smuggling: Drugs             | Nonviolent Criminal          | Unknown_NA          | Unknown / NA                  | NULL             | NULL             | NULL               | NULL                 | NULL        | NULL         | NULL        | NULL   | NULL                             | NULL         | NULL             | NULL    |
|  99 | Federal Government and Finance Minister from Federal Member States officials doubled the imposed import taxes on Khat from 2.5 USD to 4 USD per kilogram in Somalia on 12 August. A majority of these imports come from Kenya and Ethiopia which are currently suspended after a suspension order was imposed due to the COVID pandemic.



                                                                            | 2020-08-12 | NA / Unknown   |      0 |       0 |                   1 | Yes         | Reliable          | National               | 2.066181, 45.327595 | Nationwide      | Somalia
               | Announcement        | Announcement      | Announcement                 | Federal Gov of Somalia       | Local_Civilian      | Civilian / Shop               | NULL             | NULL             | NULL               | NULL                 | NULL        | NULL         | NULL        | NULL   | NULL                             | NULL         | NULL             | NULL    |
| 114 | An explosion was reported in Garbaharey on the night of 11 August.  It was unclear if the explosion was a planted explosive or was caused by a suicide bomber.  At least one report indicated that 3 people were killed, and two people injured in the incident.  The attack reportedly targeted local pro-government militia.



                                                                            | 2020-08-11 | 1800-2359      |      3 |       2 |                   1 | No          | Questionable      | City / Town            | 3.3280,42.2198      | Gedo            | Garaharey
               | Terrorism           | IED               | Suicide Vest                 | Al-Shabaab*                  | Security_Forces     | Clan Militia                  | NULL             | NULL             | NULL               | NULL                 | NULL        | NULL         | NULL        | NULL   | NULL                             | NULL         | NULL             | NULL    |
| 131 | Turkish Ministry of Transport announced the resumption of scheduled and unplanned international flights by Turkish Airlines to Somalia along with 47 other countries starting 13 August.




                                                                            | 2020-08-13 | NA / Unknown   |      0 |       0 |                   1 | No          | Reliable          | National               | 2.019611, 45.310412 | Nationwide      | Somalia
               | Announcement        | Announcement      | Announcement                 | Other Industry               | Local_Civilian      | Civilian / Shop               | NULL             | NULL             | NULL               | NULL                 | NULL        | NULL         | NULL        | NULL   | NULL                             | NULL         | NULL             | NULL    |
+-----+---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+------------+----------------+--------+---------+---------------------+-------------+-------------------+------------------------+---------------------+-----------------+----------------------------------+---------------------+-------------------+------------------------------+------------------------------+---------------------+-------------------------------+------------------+------------------+--------------------+----------------------+-------------+--------------+-------------+--------+----------------------------------+--------------+------------------+---------+
37 rows in set (0.04 sec)